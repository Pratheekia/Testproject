import java.util.Scanner;

public class gcdoftwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = scan.nextInt();
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		
		isgcdoftwono(a,b);
		System.out.println("Gcd = "+isgcdoftwono(a,b));
		

	}

	 static int  isgcdoftwono(int a, int b) {
		// TODO Auto-generated method stub
		 int gcd = 0;
		 for(int i = 1;i<=a&&i<=b;i++) {
			 if(a%i==0&&b%i==0) {
				 gcd = i;
			 }
		 }
		return gcd;
		
	}

}
