package edu.ren.datastructure.interviewBit.array;

import java.util.Iterator;

public class SpiralArray<T> {
    T[][] arr;

    public SpiralArray(T[][] arr) {
        this.arr = arr;
    }

    Iterator<T> iterator() {
        return new SpiralIterator();
    }

    enum IteratorDirection {
        LEFT_TO_RIGHT {
            @Override
            CellValue getNextPosition(CellValue currentValue) {
                if (currentValue.columnIndex < currentValue.endColumn) {
                    currentValue.columnIndex += 1;
                } else {
                    currentValue.rowIndex += 1;
                    currentValue.direction = DOWN;
                }
                return currentValue;
            }
        },
        DOWN {
            @Override
            CellValue getNextPosition(CellValue currentValue) {
                if (currentValue.rowIndex < currentValue.endRow) {
                    currentValue.rowIndex += 1;
                } else {
                    currentValue.columnIndex -= 1;
                    currentValue.direction = RIGHT_TO_LEFT;
                }
                return currentValue;
            }
        },
        RIGHT_TO_LEFT {
            @Override
            CellValue getNextPosition(CellValue currentValue) {
                if (currentValue.columnIndex > currentValue.startColumn) {
                    currentValue.columnIndex -= 1;
                } else {
                    currentValue.rowIndex -= 1;
                    currentValue.direction = UP;
                }
                return currentValue;
            }
        },
        UP {
            @Override
            CellValue getNextPosition(CellValue currentValue) {
                if (currentValue.rowIndex > currentValue.startRow+1) {
                    currentValue.rowIndex -= 1;
                } else {
                    currentValue.shrink();

                }
                return currentValue;
            }
        };

        abstract CellValue getNextPosition(CellValue cellValue);
    }


    private static class CellValue {
        int rowIndex;
        int columnIndex;
        int endRow;
        int endColumn;
        int startRow;
        int startColumn;
        IteratorDirection direction;

        public CellValue(int startRow, int startColumn, int endRow, int endColumn) {
            this.rowIndex = this.startRow = startRow;
            this.columnIndex = this.startColumn = startColumn;
            this.endRow = endRow;
            this.endColumn = endColumn;
            direction = IteratorDirection.LEFT_TO_RIGHT;
        }

        void shrink() {
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
            direction = IteratorDirection.LEFT_TO_RIGHT;
            rowIndex = startRow;
            columnIndex = startColumn;
        }

        boolean isValidPosition() {
            return rowIndex >= startRow && columnIndex >= startColumn && rowIndex <= endRow && columnIndex <= endColumn;
        }
    }

    private class SpiralIterator implements Iterator<T> {
        IteratorDirection direction = IteratorDirection.LEFT_TO_RIGHT;
        int startRow = 0, startColumn = 0;
        int endRow = arr.length - 1;
        int endColumn = arr[0].length - 1;
        int rowPosition = 0, columnPosition = 0;
        final CellValue cellValue = new CellValue(0, 0, endRow, endColumn);

        @Override
        public boolean hasNext() {
            return cellValue.isValidPosition();
            // return rowPosition >= startRow && columnPosition >= startColumn && rowPosition <= endRow && columnPosition <= endColumn;
        }

        @Override
        public T next() {
            T result = arr[cellValue.rowIndex][cellValue.columnIndex];
            direction.getNextPosition(cellValue);
            direction = cellValue.direction;
            return result;
        }
    }
}
