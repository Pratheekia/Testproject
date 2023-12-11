package Patternprog;

import java.util.Scanner;

public class Pat9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the first num" );
		     int n =scan.nextInt();
	       System.out.println("Enter the character");
	        char ch=scan.next().charAt(0);           //another type
	        for(int i=1;i<=n; i++)                  // n-5
			{                                         
	        	 for(int j=1;j<=i; j++)               
	            {
				System.out.print("-");
			}
              for(int j=1;j<=11-2*i ; j++)              //n-2*i+1 
            	  
              {                                           //the logic
            	  System.out.print(ch);                  //         ->stars
	        		                                    //          9=10-1 {                                      //          7=10-3
				                                        //          5=10-5
			}                                           //          3=10-7
                                                        //          1=10-9
	        System.out.println();                       // =        10-2*i+1=11-2*i
			}
                                                           //

	}

}
