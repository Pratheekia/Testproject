package Searchingalg;

import java.util.Scanner;

public class Binsearch1 {

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
		System.out.println(Binsearch2.searching(arr,key));

	}

}
