
import java.util.Scanner;
public class twodigitnumornot {
public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		
			if(num<100 && num>9)
			{
				System.out.println("yes it is 2 digit");
			}
			else
			{
				System.out.println("no its not 2 digit");
			}
		}
}