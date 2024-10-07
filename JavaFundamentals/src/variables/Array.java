package variables;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		//Dynamic Read of Array 
		Scanner s=new Scanner(System.in);
		int r=3,c=3;
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter "+i+" row elements");
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<r;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		
	}

}
