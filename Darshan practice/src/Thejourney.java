import java.util.Scanner;
public class Thejourney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the speed");
		double a = scan.nextDouble();
		System.out.println("enter the time");
		double b = scan.nextDouble();
		Journeycalculator p1 = new Journeycalculator();
		p1.calculateDistance (a,b);

	}

}
