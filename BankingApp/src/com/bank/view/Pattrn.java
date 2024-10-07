package com.bank.view;

public class Pattrn {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" "+" ");
			}
			for(int z=1;z<=i;z++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
