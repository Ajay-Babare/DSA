//904. Fruit Into Baskets
//You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
//You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
//You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
//Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
//Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//Given the integer array fruits, return the maximum number of fruits you can pick.
package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class TotalFruit {
    public int totalFruit(int[] arr) {
        int n = arr.length, i=0,j=0,maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(j<n) {
        	if(map.containsKey(arr[j]))
        		map.put(arr[j], map.get(arr[j])+1);
        	else map.put(arr[j], 1);
        	
        	while(map.size()>2) {
        		int freq = map.get(arr[i]);
        		if(freq==1) map.remove(arr[i]);
        		else map.put(arr[i], freq-1);
        		i++;
        	}
        	int len = j-i+1;
        	maxLen = Math.max(maxLen, len);
        	j++;
        }
        return maxLen;
    }
}
