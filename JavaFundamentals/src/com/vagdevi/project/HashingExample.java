package com.vagdevi.project;

import java.util.HashMap;
import java.util.Set;

public class HashingExample {
	public static void main(String[] args) {
		int arr[]= {3,4,5,3,2,3,3,1,4};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.containsKey(arr[i]))
			{
			 hm.put(arr[i], 1)	;
			}
			else
			{
				int v=hm.get(arr[i]);
				hm.put(arr[i], v+1);
			}
		}
		Set<Integer> key=hm.keySet();
		int maxVal=0;
		int maxKey=0;
        for(Integer x:key)
        {
        	if(maxVal<hm.get(x)) {
        		maxVal=hm.get(x);
        		maxKey=x;
        	}
        }
		System.out.println(maxKey);
		
		
	}

}
