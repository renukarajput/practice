package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class RotateMatrixClockwise {
    enum DIRECTION {
        LEFT_TO_RIGHT {
            @Override
            void setNextPoint(Point point, int start, int end) {
                point.row = point.col;
                point.col = end;
            }

            @Override
            DIRECTION next() {
                return DOWN;
            }
        },
        DOWN {
            @Override
            void setNextPoint(Point point, int start, int end) {
                point.col = start+end - point.row;
                point.row = end;

            }

            @Override
            DIRECTION next() {
                return RIGHT_TO_LEFT;
            }
        },
        RIGHT_TO_LEFT {
            @Override
            void setNextPoint(Point point, int start, int end) {
                point.row = point.col;
                point.col = start;

            }

            @Override
            DIRECTION next() {
                return UP;
            }
        },
        UP {
            @Override
            void setNextPoint(Point point, int start, int end) {
                point.col = start+end - point.row;
                point.row = start;
            }

            @Override
            DIRECTION next() {
                return LEFT_TO_RIGHT;
            }
        };

        abstract void setNextPoint(Point point, int start, int end);

        abstract DIRECTION next();
    }

    class Point {
        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        int row;
        int col;

        @Override
        public String toString() {
            return "Point{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }

    void rotateNintyDegrees(ArrayList<ArrayList<Integer>> arr) {
        final int lastIndex = arr.size() - 1;
        int start = 0, end = lastIndex;
        while (start <= end) { //iterate as many times as no of spiral squares
            for (int i = start; i < end; i++) {
                DIRECTION direction = DIRECTION.LEFT_TO_RIGHT;
                int num = arr.get(start).get(i);
                int currentRow = start, currentCol = i;
                while (true) {
                    Point point = new Point(currentRow, currentCol);
                    direction.setNextPoint(point, start, end);
                    int nextNum = arr.get(point.row).get(point.col);
                    arr.get(point.row).set(point.col, num);
                    if (point.row == start && point.col == i) {
                        break;
                    }
                    num = nextNum;
                    currentRow = point.row;
                    currentCol = point.col;
                    direction = direction.next();
                }
            }
            start++;
            end--;

        }
    }
}
