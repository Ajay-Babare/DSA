//2094. Finding 3-Digit Even Numbers
//You are given an integer array digits, where each element is a digit. The array may contain duplicates.
//You need to find all the unique integers that follow the given requirements:
//The integer consists of the concatenation of three elements from digits in any arbitrary order.
//The integer does not have leading zeros.
//The integer is even.
//For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
//Return a sorted array of the unique integers.
package mapsAndSet;

import java.util.ArrayList;
import java.util.HashMap;

public class FindEvenNumbers {
	public int[] findEvenNumbers(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int ele : arr) {
			if(map.containsKey(ele)) {
				int freq = map.get(ele);
				map.put(ele, freq+1);
			}
			else map.put(ele, 1);
		}
		ArrayList<Integer>ans = new ArrayList<>();
		for(int i=100;i<=999;i+=2) {
			int x = i;
			int c=x%10; x/=10;
			int b=x%10; x/=10;
			int a=x;
			if(map.containsKey(a)) {
				int aFreq = map.get(a);
				map.put(a, aFreq-1);
                if(aFreq==1) map.remove(a);
				if(map.containsKey(b)) {
					int bFreq = map.get(b);
					map.put(b, bFreq-1);
                    if(bFreq==1) map.remove(b);
					if(map.containsKey(c)) {
						ans.add(i);
					}
					map.put(b, bFreq);
				}
				map.put(a, aFreq);
			}
		}
		int[] ans2 = new int[ans.size()];
		for(int i=0; i<ans2.length;i++) {
			ans2[i]=ans.get(i);
		}
		return ans2;
	}
}
