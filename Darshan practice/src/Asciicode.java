import java.util.Scanner;
public class Asciicode{

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("print ascii code");
	//asci alphabet to num
	//char a=scan.next().charAt(0);
	//int b=(int)a;
	
	//asci num to alphabet
	int a=scan.nextInt();
	char b=(char)a;
  System.out.println(b);
	}

}
//A-Z 65-90
// a-z 97-122
//0-9 48-57