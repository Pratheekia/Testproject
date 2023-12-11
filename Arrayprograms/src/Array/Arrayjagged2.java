package Array;
import java.util.Scanner;
public class Arrayjagged2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the number of teams");
		int n = scan.nextInt();
		
		//jagged array
		float [][] arr = new float [n][];
		for(int i=0;i<=arr.length-1;i++)   
		
			{
				System.out.println("Enter the no of players in the teams " +(i+1) );
				int n1=scan.nextInt();
				arr[i]=new float[n1];
			}
		
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the height of team" +(i+1) + " player "  + (j+1)+ " is " );
				arr[i][j]=scan.nextFloat();				
	}

}
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
		System.out.println(" the height of team" +(i+1) + " player "  + (j+1)+ " is " +arr[i][j]);

	}
		}}
}