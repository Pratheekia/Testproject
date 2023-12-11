package looping;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num");
		int i=scan.nextInt();
		while(i>1)
		{
			i=i/2;
			System.out.println(i);
			
			
		}

	}

}
