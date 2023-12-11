package pattern;
import java.util.Scanner;

public class Patternstrt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
/*
 Enter the value of n                
6
*****
*****
*****
*****
*****
*****
         */

/*Enter the value of n
5
*****
*****
*****
*****
*****
            */