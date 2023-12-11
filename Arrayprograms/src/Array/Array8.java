package Array;
import java.util.Scanner;
public class Array8 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.println("enter the number of classrooms");
		 int n = scan.nextInt();
		 System.out.println("Enter the number of students present in each of the classrooms");
		 int n1=scan.nextInt();
		 int [][] arr= new int [n][n1];
		 for(int i=0; i<=arr.length-1;i++)
		 {
			 for(int j=0; j<=n1-1; j++)
			 {
				System.out.println("the marks of student" +(j+1)+ " in classroom" +(i+1)+ " is:");
				arr[i][j]=scan.nextInt();
				
			 }
		 }
		 for(int i=0; i<=arr.length-1;i++)
		 {
			 for(int j=0; j<=n1-1; j++)
			 {
				 System.out.println("the marks of student"+j+1 +" in classroom"+(i+1)+" is:" + arr[i][j]);
			 }
	}
	}
}
