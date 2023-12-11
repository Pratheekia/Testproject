import java.util.Scanner;

public class numendswith0ornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				System.out.println("enter the number");
				int num=scan.nextInt();
				
				if(num%10==0)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}

	}

}
