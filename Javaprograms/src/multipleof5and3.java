import java.util.Scanner;

public class multipleof5and3 {   //multiple of 5,3,7

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the number");
		
		int n=scan.nextInt();
		if(n%5==0 && n%3==0 && n%7==0 ) 
		{
			System.out.println("the number is multiple of 5 and 3");
		}
		else
		{
			System.out.println("not a multiple");
		}
		

	}

}
