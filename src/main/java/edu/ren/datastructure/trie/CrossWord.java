package edu.ren.datastructure.trie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CrossWord {
    char[][] words;
    Trie trie;

    CrossWord(String[] rows,Collection<String> dictionary) {
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

    List<String> getDictionaryWords() {
        foundWords = new ArrayList<>();
        traverse();
        return foundWords;
    }

    void traverse() {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {

                findWordsStartingAtCell(new StringBuilder(), i, j,0);
                findWordsStartingAtCell(new StringBuilder(), i, j,1);
                findWordsStartingAtCell(new StringBuilder(), i, j,2);
            }
        }
    }

    private void findWordsStartingAtCell(StringBuilder foundCharsStringBuilder, int x, int y,int direction) {
        while (x < words.length && y < words[0].length) {
            foundCharsStringBuilder.append(words[x][y]);
            int[] result = getDictionaryWordOrPrefixLength(foundCharsStringBuilder.toString());
            if (result[1] == 1) {
                foundWords.add(foundCharsStringBuilder.toString());
            } else if (result[0] == 0) {
                //backtrack to make prefix match a word in dict
                foundCharsStringBuilder.deleteCharAt(foundCharsStringBuilder.length() - 1);
            }
              //prefix found ,so continue search
            if(direction==0){ //replace if/else with enum
                x+=1;
            }else if(direction==1){
                y+=1;
            }else if(direction==2){
                x+=1;
                y+=1;
            }

        }
    }

    int[] getDictionaryWordOrPrefixLength(String key) {
        return trie.findLengthOfMatchingPrefix(key);
    }
}
