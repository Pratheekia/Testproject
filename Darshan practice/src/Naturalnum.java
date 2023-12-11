import java.util.Scanner;
public class Naturalnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.println(i);
        }
	}

}

//*  or without using scanner cls int n=100;
//for(int i=1;i<=n;i++)
//{
	//System.out.println(i);
//}