package Tasks;

import java.util.Scanner;

public class Sumofnaturalnum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num" );
        int num =scan.nextInt();
        int sum=0;
        for(int i=1; i<=num; i++)
        {
        	sum+=i;
        	System.out.println(sum);
        }

	}

}
