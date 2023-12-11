package sortingalg;

import java.util.Scanner;

public class Bubblesorting1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=scan.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements present in an array ");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Array before sorting");
     for(int i=0;i<=arr.length-1;i++)
     {
    	 System.out.println(arr[i] + " ");
     }
     System.out.println();
     int [] sortedArr= Bubblesort2.sort(arr);
     System.out.println("Array after sorting");
     for(int i=0;i<=sortedArr.length-1;i++)
     {
    	 System.out.println(sortedArr[i] + " ");
     }
	}

}
