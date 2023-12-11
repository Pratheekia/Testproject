import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter num1,num2");
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	int a= n1 +n2;
	int b= n1-n2;
	int c= n1*n2;
	float d=(float) ((double)n1/n2);
	System.out.println("Addition" + a);
	System.out.println("sub" + b);
	System.out.println("mul" + c);
	System.out.println("div" + d);
	}

}
	
	

	


