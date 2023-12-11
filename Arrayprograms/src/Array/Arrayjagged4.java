package Array;
import java.util.Scanner;
public class Arrayjagged4 {//assignment

	public static void main(String[] args) {  //not a jagged array

		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number of cities");
		int cities =scan.nextInt();
		int[][][] arr=new int[2][3][5];
	
        
        for(int i=0;i<=arr.length-1;i++)   
    		
		{
        	for(int j=0;j<=arr[i].length-1;j++)
        	{
        		for(int k=0;k<=arr[i][j].length-1;k++)
        		{
        			System.out.println("Enter the student age");
        			arr[i][j][k]=scan.nextInt();
        	}
        	}}
        
  for(int i=0;i<=arr.length-1;i++)   
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
			System.out.println("enter the number school" +(i+1) +"and number of class"  + (j+1)+ " and age "+ "=" + arr[i][j][k]);
			}

}
	}}
}