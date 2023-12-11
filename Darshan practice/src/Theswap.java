import java.util.Scanner;
public class Theswap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("the numbers  num1  and num2 before swapping");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3;
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("After swapping" +" num1=" + num1 + " " +" num2=" + num2);
		System.out.println();
}

}
