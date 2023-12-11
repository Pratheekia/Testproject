package Add2num;
import java.util.Scanner;
public class Class1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter firs num");
		long a =scan.nextLong();
		System.out.println("Enter sec num");
		long b=scan.nextLong();
		
		//System.out.println(Class2.adding(a, b));
		
		Class2 p1=new Class2();
		long c=p1.adding(a, b);
		System.out.println( c);
		}
}
