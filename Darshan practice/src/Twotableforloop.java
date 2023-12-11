import java.util.Scanner;
public class Twotableforloop {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the table");
    int n = scan.nextInt();
    for(int i=1;i<=10;i++)                    //i=1-10
    {
    	System.out.println(n + "*"+i+ "="+ n*i);  //2*i=prints 2 multiple 10
    }
	}

}
