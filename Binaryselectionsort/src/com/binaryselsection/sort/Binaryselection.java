package com.binaryselsection.sort;

import java.util.Scanner;

public class Binaryselection {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int [] arr= new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " numbers to be stored in the array");
		for(int i=0; i<=arr.length-1;i++)
        {
        	
        	arr[i]=scan.nextInt();
        }
		System.out.println("Enter the key to be searched");
		int key =scan.nextInt();
        
        
        for(int i=0; i<=arr.length-1; i++)
        {
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high)
        {
        if(key==arr[mid])
        {
        	System.out.println("key "+key+" found at index: " +mid);
        	return;
        
        }
        
        else if(key>arr[mid])
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
        System.out.println("key is not found");
	}
	}
}
