package Array;
import java.util.Scanner;

public class Array4 { //elevator lift

	public static void main(String[] args) {
		int  [] arr= new int [5];
		int a=0; //if condition
		//creating array object
		Scanner scan=new Scanner(System.in );
		System.out.println("Enter the passenger weights");
		      		      
				//storing name inside the array
				
				
				for(int i=0;i<=arr.length-1;i++)
				{
					
					
					 arr[i]=scan.nextInt();
				}
				
				
			
				//displaying the number
				for(int i=0;i<=arr.length-1;i++)
				{
					a=arr[i]+a;
				}
				System.out.println("Total"+  a);
					if(a<=800)
					{
						System.out.println("Lift will work");
					}
					else
					{
						System.out.println("Lift will not work");
					}
					
				}
		
		
	}
//Enter the passenger weights
//90
//98
//87
//76
//54
//Total405
//Lift will work


