package pattern;
import java.util.Scanner;
public class pattern16 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=n+1-i;j++)
        	{
        		System.out.print(j+" ");
        	}
        	 System.out.println();
        }
       
	}

}