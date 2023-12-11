import java.util.Scanner;
public class GalacticArithmatic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		long num1 = scan.nextLong();
		System.out.println("Enter the second number");
		long num2 = scan.nextLong();
		Galactic g1 = new Galactic();
				g1.galacticAddition(num1,num2);
				
		

	}

}
