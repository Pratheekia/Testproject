import java.util.Scanner;
public class add2num {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the 2 numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=n1+n2;
		System.out.println("the sum of 2 number n1 " +n1+ " and n2 " +n2+ " is "+ n3);
        
	}

}
