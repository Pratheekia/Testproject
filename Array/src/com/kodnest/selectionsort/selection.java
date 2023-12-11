package com.kodnest.selectionsort;

import java.util.Scanner;

import com.kodnest.bubblesort.Bubblesort;

public class selection {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the size of an array");
			// creating the array
			int[] arr=new int[scan.nextInt()];
			//storing the element
			System.out.println("Enter" + arr.length + "number to be stored in array");
			for(int i=0; i<=arr.length-1;i++)
			{
				arr[i]=scan.nextInt();
			}
			//displaying the array elements before swapping
			System.out.println("Before sorting the array is");
			for(int i=0; i<=arr.length-1; i++ )
			{
				System.out.println(arr[i]+ " ");
				
			}
			System.out.println();
	   //calling the selection sorting() and storing the returned sorted array in sorted arr
			int[] sortedArr =Selectionsort.selectionSorting(arr);
			//displaying the array elements after sorting
			System.out.println("After sorting the array is:");
			for(int i=0; i<=sortedArr.length-1;i++)
			{
				System.out.println(sortedArr[i] + " ");
			}

	}

}
