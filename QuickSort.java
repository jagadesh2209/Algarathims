  package com.jsp.Algarithoms;

public class QuickSort {

	public static void main(String[] args) 
	{
		int[]a= {8,25,6,0,2,3,11,9,74,5};
		sort(a,0,a.length-1);
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static void sort(int []a,int start,int end )
	{
		if(start>=end)//example a={3}.
		{
			return;
		}
		int pivot=a[(start+end)/2];
		int i=start,j=end;
		while(i<=j)
		{
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}
}
