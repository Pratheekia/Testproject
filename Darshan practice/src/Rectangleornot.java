import java.util.Scanner;
public class Rectangleornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length");
		int a = scan.nextInt();
		System.out.println("enter the breadth");
		int b = scan.nextInt();
		int c =a*b;
		if(a==b)
		{
			System.out.println(" square");
		
	}
		else
		{
			System.out.println("rectangle");
		}
	}
}
