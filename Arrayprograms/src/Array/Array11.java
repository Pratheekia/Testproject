package Array;
import java.util.Scanner;
public class Array11 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the number of teams");
		int n = scan.nextInt();
		System.out.println("Enter the number of players of the each team");
		int n1 = scan.nextInt();
		
		Float[][] arr = new Float [n][n1];
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the height of team " +(i+1) + " player " + (j+1)+ " is ");
				arr[i][j]=scan.nextFloat();
			}
		}
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the name of the team " +(i+1) + " player "  + (j+1)+ " is " +arr[i][j]+ " feet ");
				
	}

}
	

	}

}
