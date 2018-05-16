package edu.ren.datastructure.trie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CrossWord {
    char[][] words;
    Trie trie;

    public CrossWord(String[] rows,Collection<String> dictionary) {
        words = new char[rows.length][rows[0].length()];
        trie=new Trie();
        dictionary.forEach(x->trie.insert(x));
        int i = 0;
        for (String row : rows) {
            words[i] = row.toCharArray();
            i++;
        }
    }
    List<String> foundWords ;

    public List<String> getDictionaryWords() {
        foundWords = new ArrayList<>();
        traverse();
        return foundWords;
    }

    private void traverse() {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {
                tryWordsInPossibleDirections(i, j);
            }
        }
    }


    protected void tryWordsInPossibleDirections(int i, int j) {
        for (Direction direction:Direction.values()) {
            findWordsStartingAtCell(new StringBuilder(), i, j, direction);
        }
    }

    protected enum Direction{
        RIGHT {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x+1,y};
            }
        },
        LEFT {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x-1,y};
            }
        },
        DOWN {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x,y+1};
            }
        },
        UP {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x,y-1};
            }
        },
        RIGHT_TO_LEFT_DIAGONAL_DOWN {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x-1,y+1};
            }
        },
        RIGHT_TO_LEFT_DIAGONAL_UP {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x-1,y-1};
            }
        },
        LEFT_TO_RIGHT_DIAGONAL_DOWN {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x+1,y+1};
            }
        },
        LEFT_TO_RIGHT_DIAGONAL_UP {
            @Override
            int[] getNextCellPosition(int x,int y) {
                return new int[]{x+1,y-1};
            }
        };
        abstract int[] getNextCellPosition(int x,int y);

    }
    protected void findWordsStartingAtCell(StringBuilder foundCharsStringBuilder, int x, int y,Direction direction) {
        while (x>=0 &&y>=0 && x < words.length && y < words[0].length) {
            foundCharsStringBuilder.append(words[x][y]);
            Trie.PrefixSearchResult result = getDictionaryWordOrPrefixLength(foundCharsStringBuilder.toString());
            if (result.isDictionaryWord) {
                foundWords.add(foundCharsStringBuilder.toString());
            } else if (!result.isPrefix) {
                 return;
            }
              //prefix found ,so continue search
            int[] nextCellPosition = direction.getNextCellPosition(x, y);
            x=nextCellPosition[0];
            y=nextCellPosition[1];

        }
    }

    private Trie.PrefixSearchResult getDictionaryWordOrPrefixLength(String key) {
        return trie.findLengthIfKeyIsAMatchingPrefix(key);
    }
}
