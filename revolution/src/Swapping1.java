import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st num");
		int a=scan.nextInt();
		System.out.println("Enter 2nd num");
		int b=scan.nextInt();
		int temp; 
		temp=a;
		a=b;
		b=temp;
		System.out.println("a value before swapping is 10");
		System.out.println("a value after swapping is " + a);
		System.out.println("b value before swapping is 20");
		System.out.println("b value after swapping is " + b);
		

	}

}
