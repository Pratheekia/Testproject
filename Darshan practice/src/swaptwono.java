import java.util.Scanner;

public class swaptwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two number to swap that value");
		int x=scan.nextInt();
		int y = scan.nextInt();
		isswapa(x,y);

	}

	 static void isswapa(int x, int y) {
		// TODO Auto-generated method stub
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("X="+x);
		 System.out.println("y="+y);
		
	}

}
