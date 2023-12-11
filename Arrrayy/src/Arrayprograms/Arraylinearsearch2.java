package Arrayprograms;
import java.util.Scanner;
public class Arraylinearsearch2 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int [] arr=new int [n];
		
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println("enter the elements");
			arr [i] =scan.nextInt();
		}
	Arraybro2 p1=new Arraybro2();
		p1.array3(n,arr);
		 

	}

}