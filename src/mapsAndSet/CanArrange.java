//1497. Check If Array Pairs Are Divisible by k
//Given an array of integers arr of even length n and an integer k.
//We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
//Return true If you can find a way to do that or false otherwise.
package mapsAndSet;

import java.util.HashMap;

public class CanArrange {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	int ele= arr[i]%k;
        	if(ele<0) ele+=k;
//        	int ele = ((arr[i]%k)+k)%k;
        	if(map.containsKey(ele)) {
        		int freq = map.get(ele);
        		map.put(ele, freq+1);
        	}
        	else map.put(ele, 1);
        }
        if(map.containsKey(0)) {
        	if(map.get(0)%2!=0) return false;
        	map.remove(0);
        }
        if(k%2==0 && map.containsKey(k/2)) {
        	if(map.get(k/2)%2!=0) return false;
        	map.remove(k/2);
        }
        for(int key : map.keySet()) {
        	int rem = k - key;
        	if(!map.containsKey(rem)) return false;
        	int keyFreq = map.get(key);
        	int remFreq = map.get(rem);
        	if(keyFreq != remFreq) return false;
        }
        return true;
    }
}
