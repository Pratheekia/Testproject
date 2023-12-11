import java.util.Scanner;
public class Discountapplicable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the purchase cost");
		int a = scan.nextInt();
		if(a>100)
		{
			System.out.println("discount applicable");
		}
		else {
			System.out.println("not Applicable");
		}
	}

}
//skipped vote eligible bcus its same i.e nxt que
