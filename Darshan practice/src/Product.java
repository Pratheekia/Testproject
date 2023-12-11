import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the code");
		char n = scan.next().charAt(0);
		if(n=='a') {
			System.out.println("apple");}
			else if (n=='b')
			{
				System.out.println("ball");
			}
			else if (n=='c')
			{
				System.out.println("cat");
			}
			else {
				System.out.println(" please enter between a,b,c");
			}
			
		}
}
		
