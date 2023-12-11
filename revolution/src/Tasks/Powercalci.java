package Tasks;

import java.util.Scanner;

public class Powercalci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num" );
        int num =scan.nextInt();
        System.out.println("Enter the power" );
        int power =scan.nextInt();
        
        System.out.println(Math.pow(num, power));  //Math.pow() is a inbuilt

	}

}
