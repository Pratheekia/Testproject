import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner (System.in);
		    System.out.println("enter the value of row");
		    int row=scan.nextInt();
		   
		    System.out.println("enter the character");
		    char ch=scan.next().charAt(0);
		    
		    for(int i=1;i<=row;i++)
		    {  
		   	for(int j=1;j<=row;j++)
		   	{
		   		System.out.print("-");
		   	}
		   	for(int j=1;j<=row;j++)
		   	{
		   		if(i==1||i==row || j==1||j==row )
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
