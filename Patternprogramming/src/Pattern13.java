import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);
		for (int i=1; i<=n;i++)
 
		{
			System.out.println(" ");
		    
for(int j=2;j<=2*i-1;j++)
            {           
            System.out.print(ch);
            }
            System.out.println();
        }
        for (int i =2; i<=n ; i++)
        {
            for (int j = 1; j <=i; j++)
            {   
            	System.out.print(" ");
            }
            for(int j=1;j<=11-2*i;j++)
            
                System.out.print(ch);
            
        }
    }
    }
