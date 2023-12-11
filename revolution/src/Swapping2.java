import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st num");
		int a=scan.nextInt();
		System.out.println("Enter 2nd num");
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a is  "+ a+ " and b is " + b);

	}

}
