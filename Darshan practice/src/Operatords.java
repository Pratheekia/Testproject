import java.util.Scanner;
public class Operatords{

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter num1,num2");
	int a = scan.nextInt();
	int b = scan.nextInt();
    System.out.println("lesser than"+ " "+ (a<b));
    System.out.println("greater than"+ " " + (a>b));
    System.out.println("lesser than or equal"+ " " + (a<=b));
    System.out.println("greater than or equal"+ " " + (a>=b));
    System.out.println("not equal"+  " " +(a!=b));
    System.out.println("equal to equal to"+ " " +  (a==b));
    
	}

}
