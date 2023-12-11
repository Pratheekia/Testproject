package pattern;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int n=scan.nextInt();
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=n;j++)
			{
				if(j>=6-i)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}

}
