package edu.leetcode.backtracking;



import java.util.*;

public class SynonumSentences {

    public List<String> generateSentences(List<List<String>> synonyms, String text) {
        Map<String, HashSet<String>> synonymMap = new HashMap<>();
        for (List<String> wordSynonyms : synonyms) {

                    HashSet<String> existing = synonymMap.get(wordSynonyms.get(0));
                    if(existing==null){
                        existing=synonymMap.getOrDefault(wordSynonyms.get(1), new HashSet<>());
                    }
                    existing.add(wordSynonyms.get(0));
                    existing.add(wordSynonyms.get(1));

                    synonymMap.put(wordSynonyms.get(0),existing);
                    synonymMap.put(wordSynonyms.get(1),existing);


        }

        List<String> outlist = new ArrayList<>();
        StringBuilder outText = new StringBuilder();
        generateSentences(text, 0, outText, synonymMap, outlist);
        Collections.sort(outlist);
        return outlist;
    }

    private void generateSentences(String text, int index, StringBuilder outText, Map<String, HashSet<String>> synonymMap, List<String> outlist) {
        if (index >= text.length()) {
              outlist.add(outText.toString());
            return;
        }
        int wordEnd = index;
        int numSpaces=0;
        while (text.charAt(wordEnd) == ' ') {
            outText.append(text.charAt(wordEnd));
            wordEnd++;
            index++;
            numSpaces++;
        }
        while (wordEnd < text.length() && text.charAt(wordEnd) != ' ') {
            wordEnd++;
        }
        String word = text.substring(index, wordEnd);
        Set<String> syonyms = synonymMap.get(word);
        if (syonyms == null) {
            outText.append(word);
            generateSentences(text, index+word.length(), outText, synonymMap, outlist);
            outText.delete(outText.length() - word.length(), outText.length());
        } else {
            for (String synonym : syonyms) {
                outText.append(synonym);
                generateSentences(text, index + word.length(), outText, synonymMap, outlist);
                outText.delete(outText.length() - synonym.length(), outText.length());

            }

        }
        outText.delete(outText.length()-numSpaces,outText.length());

    }
}

