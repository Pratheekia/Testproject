package Arrayprograms;
import java.util.Scanner;
public class Arraypractice3dimenmsional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of school");
        int n = scan.nextInt();
        System.out.println("enter the no of class present in each school");
        int n1 = scan.nextInt();
        System.out.println("enter the no of studemts present in each class of each school");
        int n2 = scan.nextInt();
        int [][][] arr = new int [n][n1][n2];
        for(int i=0;i<=arr.length-1;i++)
        {
        	for(int j=0;j<=arr[i].length-1;j++)
        	{
        		for(int k=0;k<=arr[i][j].length-1;k++)
        		{
        			System.out.println("enter the marks of each school" + (i+1) + " of class " + (j+1) + " of student " + (k+1) + " mark is ");
        			arr[i][j][k] =scan.nextInt();        		
        	}
        }
        }
	 for(int i=0;i<=arr.length-1;i++)
     {
     	for(int j=0;j<=arr[i].length-1;j++)
     	{
     		for(int k=0;k<=arr[i][j].length-1;k++)
     		{
     			System.out.println(" the marks of each school" + (i+1) + " of class " + (j+1) + " of student " + (k+1) + " mark is " + arr[i][j][k]);
     		}}}}}

