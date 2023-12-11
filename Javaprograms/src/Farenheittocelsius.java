import java.util.Scanner;

public class Farenheittocelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the  Farenheit value");
		float F=scan.nextFloat();
		float cel=(F-32)*5/9;
		System.out.println("the celcius converted value is " + cel);
	}

}
