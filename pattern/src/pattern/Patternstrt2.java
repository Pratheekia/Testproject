package pattern;
import java.util.Scanner;
public class Patternstrt2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
        int n = scan.nextInt();
        for(int i=1;i<=2*n-1;i++)
        {
        	int totalColsInRow=i>=n?2*n-i-1:i;
        	for(int j=1;j<=totalColsInRow;j++)
        	{
        		System.out.print("*"+" ");
        	}
        	 System.out.println();
        }
       
	}

}