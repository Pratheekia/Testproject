import java.util.Scanner;

public class perimeterofrectangle {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
			System.out.println("enter the  length of rect");
			float l=scan.nextFloat();
			System.out.println("enter the  breadth of rect");
			float b=scan.nextFloat();
			float p=2*(l+b);
			System.out.println("the perimeter of rectangle " + p);

		

	}

	}


