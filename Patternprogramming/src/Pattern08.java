import java.util.Scanner;

public class Pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);
		for(int i=1;i<=a;i++)
		{
		for(int j=1;j<=a;j++)
		{
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}