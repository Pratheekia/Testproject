  import java.util.Scanner;
public class Planetexplorer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius");
		double a = scan.nextDouble();
		Planet p1 = new Planet();
		p1.planetExp(a);

	}

}
