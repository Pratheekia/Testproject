import java.util.Scanner;
public class threedigitandmultipleof10 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
			System.out.println("enter the number");
			int num=scan.nextInt();
			if(num*10==0 && num>99)
			{
				System.out.println("comb of mul of 10 and 3 digit");
			}
			else
			{
				System.out.println("not");
			}
	}

}
