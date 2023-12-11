import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scan.nextInt();
		if(a>0)
		{
			System.out.println("positive");
		}
		else if (a==0)
		{
			System.out.println("NEutral");
		}
		else
		{
			System.out.println("negative");
		}
	}

}
