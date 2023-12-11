import java.util.Scanner;

public class perimeterofsquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the  length of side of square");
		float s=scan.nextFloat();
		float p=4*s;
		System.out.println("the perimeter of square " + p);

	}

}
