import java.util.Scanner;

public class Pattern012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);
		
		for(int i=1;i<=a;i++)
		{
			
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
			for(int j=1;j<=(11-2*i);j++)
			{
				if(i==1||j==(11-2*i)||j==1)
				{
				System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			
			System.out.println();
		}

	}

}