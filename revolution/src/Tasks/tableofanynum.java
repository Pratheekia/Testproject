package Tasks;

import java.util.Scanner;

public class tableofanynum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num" );
        int num =scan.nextInt();

    	System.out.println("The table of " + num  + " is");
        for(int i=1; i<=10; i++)
        {
        	System.out.println(num + "*" + i + "="+ num*i);
        }

	}

}
