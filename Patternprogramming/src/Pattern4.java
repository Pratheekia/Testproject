import java.util.Scanner;

public class Pattern4
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the value of row");
		int row=scan.nextInt();
		System.out.println("Enter the value of column");
		int column=scan.nextInt();
		System.out.println("Enter the char wgich should to be printed");
        char ch = scan.next().charAt(0);
        //for printing the rows
		for(int i=1; i<=5;i++)
		{
			//for [printing the cgharaacter in each row
			for(int j=1; j<=10;j++)
			{
			System.out.print(ch);
	}
			System.out.println();  // to print down by down rows
	}

	}

}
