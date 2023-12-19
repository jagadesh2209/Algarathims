package com.jsp.Algarithoms;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[]a= {4,8,6,9,7,2,3,1};
		sort(a);
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
