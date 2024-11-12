//1207. Unique Number of Occurrences
//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
package mapsAndSet;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else
                map.put(ele,1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            set.add(val);
        }
        return map.size() == set.size();
    }
}
