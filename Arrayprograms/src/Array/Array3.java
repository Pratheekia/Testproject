package Array;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the marks");
		int  arr [] =new int [5];
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i] =scan.nextInt();
			}
		System.out.println(" the marks are");
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	  

}
