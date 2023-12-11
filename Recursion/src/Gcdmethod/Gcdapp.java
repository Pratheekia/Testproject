package Gcdmethod;

import java.util.Scanner;

public class Gcdapp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter a num");
        int n = scan.nextInt();
        int m=scan.nextInt();
        Gcd p1=new Gcd();
       System.out.println(p1.gcdMethod(n, m));
	}

}
