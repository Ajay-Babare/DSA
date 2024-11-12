//3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest 
//substring without repeating characters.
package mapsAndSet;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n<=1) return n;
        int maxLen = 0;
        int i=0; int j=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len = j-i;
                maxLen=Math.max(maxLen, len);
                // i ko leke jao ch ki purani position se aage
                while(s.charAt(i)!=ch) i++;
                i++; //ek aage nikalna hai
            }
            map.put(ch, j);
            j++;
        }
        int len = j-i;
        maxLen = Math.max(maxLen, len);
        return maxLen;
    }
}
