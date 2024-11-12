//2744. Find Maximum Number of String Pairs
//You are given a 0-indexed array words consisting of distinct strings.
//The string words[i] can be paired with the string words[j] if:
//The string words[i] is equal to the reversed string of words[j].
//0 <= i < j < words.length.
//Return the maximum number of pairs that can be formed from the array words.
//Note that each string can belong in at most one pair.
package mapsAndSet;

import java.util.HashSet;

public class MaximumNumberOfStringPairs {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<words.length;i++){
            String rev = reverse(words[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }
}
