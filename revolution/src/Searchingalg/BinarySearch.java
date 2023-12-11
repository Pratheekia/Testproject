package Searchingalg;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n  =scan.nextInt();
	int [] arr=new int[n];
	System.out.println("Enter the elements to be stored in an array");
	for(int i=0;i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the key to be found");
	int key=scan.nextInt();
	
	int low=0;
	int high=arr.length-1;
	int mid=(low+high)/2;
	
	while(low<=high)
	{
		if(key==arr[mid])
		{
			System.out.println("Key " +key + " is found at index " +mid );
			return;
		}
		else if(key>=arr[mid])
		{
			low=mid+1;
			high=high;
			mid=(low+high)/2;
		}
		else
		{
			low=low;
			high=mid-1;
			mid=(low+high)/2;
		}
		
	}
	System.out.println("Key not found");
	}

}
