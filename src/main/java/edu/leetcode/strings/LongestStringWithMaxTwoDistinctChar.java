package edu.leetcode.strings;

import java.util.*;

public class LongestStringWithMaxTwoDistinctChar {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s.length() <= k) {
            return s.length();
        }
        if(k == 0) {
            return 0;
        }

        HashMap<Character, Integer> rightMost = new HashMap<Character, Integer>();
        TreeSet<Character> chars = new TreeSet<Character>((a, b) -> rightMost.get(a) - rightMost.get(b));
        int right = 0;
        int left = 0;
        int maxLen = 0;

        for(char c: s.toCharArray()) {
            rightMost.put(c, right);
            if(chars.contains(c)) {
                chars.remove(c);
            }
            chars.add(c);

            if(chars.size() > k) {
                left = rightMost.get(chars.first())+1;
                chars.remove(chars.first());
            }
            maxLen = Math.max(right-left+1, maxLen);
            right++;
        }
        return maxLen;
    }
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        return lengthOfLongestSubstringKDistinct(s,2);

    }
    int lengthOfLongestSubstringKDistinct_(String s,int k) {
        if(k==0) return 0;
        Map<Character,Integer> visited=new HashMap<>();
        int maxLen=0;
        int start=0,end=0;
        for (int i = 0; i <s.length() ; i++) {
            if(visited.size()==k && !visited.containsKey(s.charAt(i))){
               while (visited.size()==k) {
                   Integer prevCount = visited.get(s.charAt(start));
                   if(prevCount ==1) {
                       visited.remove(s.charAt(start));
                   }else {
                       visited.put(s.charAt(start),prevCount-1);
                   }
                   start++;
               }
            }
            maxLen=Math.max(maxLen,end-start+1);
            end++;
            int prevCount=visited.getOrDefault(s.charAt(i),0);
            visited.put(s.charAt(i),1+prevCount);
        }
        return maxLen;
    }

    public int lengthOfLongestSubstringTwoDistinct_(String s) {
        System.out.println(s);
        if (s.length() < 2)
            return s.length();
        int first = 0, second = 1;
        int maxLen = 2;
        for (int i = 2; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (second < i && s.charAt(first) == s.charAt(second)) {
                second++;
            }
            //and second!=i first-second not all same char
            while (ch != s.charAt(second) && ch != s.charAt(first)) {
                if(second==i && s.charAt(first)==s.charAt(second)){
                    break;
                }
                first++;
            }

            maxLen = Math.max(i - first + 1, maxLen);
        }
        return maxLen;
    }


}
