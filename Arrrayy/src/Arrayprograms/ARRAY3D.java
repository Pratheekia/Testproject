package Arrayprograms;

import java.util.Scanner;

public class ARRAY3D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of cities , companies , employees");
        float [][][] arr=new float[scan.nextInt()][scan.nextInt()][scan.nextInt()];
        for(int i =0; i<=arr.length-1;i++)
        {
        	 for(int j =0; j<=arr[i].length-1;j++)
        	 {
        		 for(int k =0; k<=arr[i][j].length-1;k++)
        		 {
        			 System.out.println("Enter the salary of city" +(i+1) +"company" +(j+1) +"of employee" +(k+1) + "is");
        			 arr[i][j][k]=scan.nextFloat();
        		 }
        	 }
        }
        for(int i =0; i<=arr.length-1;i++)
        {
        	 for(int j =0; j<=arr[i].length-1;j++)
        	 {
        		 for(int k =0; k<=arr[i][j].length-1;k++)
        		 {
        			 System.out.println("Enter the salary of city" +(i+1) +"company" +(j+1) +"of employee" +(k+1) + "is"  +arr[i][j][k]);
        		 }}}		
	}

}
