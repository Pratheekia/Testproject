import java.util.Scanner;

public class add3num {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner (System.in);
		System.out.println("enter the 3 numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int n4=n1+n2+n3;
		System.out.println("the sum of  number n1 " +n1+ " and n2 " +n2+ " and n3 " +n3 +" is "+ n4);
        
	}

}
