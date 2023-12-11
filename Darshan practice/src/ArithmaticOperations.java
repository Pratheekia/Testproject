import java.util.Scanner;
public class ArithmaticOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= scan.nextInt();
		System.out.println("Enter the second number");
		int num2= scan.nextInt();
		Arithmatic g1 = new Arithmatic();
		g1.operatorArithmatic(num1,num2);
		g1.multiplyNumbers(num1, num2);

	}

}
