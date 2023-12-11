package pattern;

import java.util.Scanner;                            // from pattern 11 starting different type 

public class Pattern13 {

	public static void main(String[] args) {
		
  Scanner scan = new Scanner (System.in);
  System.out.println("Enter the value of n");
		int n=scan.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=4-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
