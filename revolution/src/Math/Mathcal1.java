package Math;

import java.util.Scanner;

public class Mathcal1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter firs num");
		int a =scan.nextInt();
		System.out.println("Enter sec num");
	     int b=scan.nextInt();
		System.out.println(Mathcal2.subNum(a, b));
		System.out.println(Mathcal2.mulNum(a, b));
		System.out.println(Mathcal2.divNum(a, b));
		System.out.println(Mathcal2.remNum(a, b));
		
	}

}
