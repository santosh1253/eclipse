package sortings;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {88,5,24,1,9,8};
		int j,i,key;
		for(j=1;j<a.length;j++)
		{
			i=j-1;
			key=a[j];
			while(i>=0 && a[i]>key)
			{
				a[i+1]=a[i];
				i=i-1;
			}
			a[i+1]=key;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
}
