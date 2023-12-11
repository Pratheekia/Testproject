package Array;
import java.util.Scanner;
public class Arrayjagged3 {//assignment not a jagged array

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number of school");
		int school = scan.nextInt();
		System.out.println("enter the number of class");
		int clas=scan.nextInt();          //class is a keyword , dont give variable name as class
		System.out.println("enter the number of student");
		int student = scan.nextInt();
		int[][][] arr=new int[school][clas][student];
		
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