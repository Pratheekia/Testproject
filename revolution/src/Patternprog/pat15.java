package Patternprog;

import java.util.Scanner;

public class pat15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the first num" );
		 int n =scan.nextInt();
	       int count=1;
	        for(int i=1;i<=n; i++)
			{
	        for(int j=1;j<=n; j++)
	        		 
	        	 {
				System.out.print(count + " ");
				count++;
			}
	        System.out.println();
			}

	}

}
