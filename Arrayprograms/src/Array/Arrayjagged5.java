package Array;
import java.util.Scanner;
public class Arrayjagged5 {//assignment

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);  //jagged array
		System.out.println("enter the number of cities");
		int cities = scan.nextInt();
		
		int[][][] arr=new int[cities][][];
		
        for(int i=0;i<=arr.length-1;i++)   
   
		{
        	System.out.println("Enter the companies");
        	int camp = scan.nextInt();
        	System.out.println("Enter the employee in the companies");
        	int sal = scan.nextInt();
        	arr[i]=new int [camp] [sal];
		}
        	for(int i=0;i<=arr[i].length-1;i++)
        	{
        		for(int j=0;j<=arr[i].length-1;j++)
        		{
        		for(int k=0;k<=arr[i][j].length-1;k++)
        		{
        			System.out.println("Enter the number of cities" + (i+1)+"and company" + (j+1) + "and employee salary" + (k+1));
        			
        			arr[i][j][k]=scan.nextInt();
        	}
        	}}
        
  for(int i=0;i<=arr.length-1;i++)   
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println(" the number of cities" + (i+1)+"and company" + (j+1) + "and employee salary" + (k+1));
			}
}
	}}
}