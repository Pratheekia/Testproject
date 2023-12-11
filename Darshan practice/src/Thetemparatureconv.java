import java.util.Scanner;
public class Thetemparatureconv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the farenheit");
		double F= scan.nextDouble();

		Temparature p1 = new Temparature();
		p1.theConv(F);
		
	}

}
