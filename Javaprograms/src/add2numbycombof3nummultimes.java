import java.util.Scanner;

public class add2numbycombof3nummultimes {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("enter the 3 numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int n4=n1+n2;
		int n5=n1+n3;
		int n6=n2+n3;
		System.out.println("the sum of  number n1 " +n1+ " and n2 " +n2+ " is "+ n4);
		System.out.println("the sum of  number n1 " +n1+ " and n3 " +n3+ " is "+ n5);
		System.out.println("the sum of  number n3 " +n3+ " and n2 " +n2+" is "+ n6);
        
	}

}
