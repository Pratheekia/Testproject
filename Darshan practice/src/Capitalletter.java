import java.util.Scanner;
public class Capitalletter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the letter");
		char a = scan.next().charAt(0);
        Capital c1 = new Capital();
        c1.Check(a);
	}

}
