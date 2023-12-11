import java.util.Scanner;
public class Evennumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the number");
    int n = scan.nextInt();
     if(n%2==0)
     {
    	 System.out.println("even number");
     }
     else
     {
    	 System.out.println("odd number");
     }
	}

}
