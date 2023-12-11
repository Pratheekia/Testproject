package Tasks;

import java.util.Scanner;

public class polygon {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sides");
        int sides =scan.nextInt();
		if(sides==5)
		{
			System.out.println("Polygon");
		}
		else
		{
			System.out.println("not a polygon");
		}

	}

}
