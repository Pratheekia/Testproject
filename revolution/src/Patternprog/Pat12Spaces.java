package Patternprog;

import java.util.Scanner;

public class Pat12Spaces {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the first num" );
		 int n =scan.nextInt();
	       System.out.println("Enter the character");
	        char ch=scan.next().charAt(0);
	        for(int i=1;i<=n; i++)
			{
	        	 for(int j=1;j<=n; j++)
	        		 
	        	 {
				System.out.print("-");
			}
              for(int j=1;j<=n; j++)
	        		 
	        	 {
            	  if(i==1 || i==n || j==1|| j==n)
            	  {
				System.out.print(ch);
			}
            	  else {
	        System.out.print("-");
			}
	        	 }
              System.out.println();


	}

}
}