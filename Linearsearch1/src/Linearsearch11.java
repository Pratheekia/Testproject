import java.util.Scanner;
public class Linearsearch11 // 1)main.Linearsearch11 , sub.Search1
{   //2)Linearsearch22 , 3) main.Linearsearch33,sub Search33
       // 1)2)3) all are same question with different approach
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int [] arr= new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " numbers to be stored in the array");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched");
		int key =scan.nextInt();
		Search1.searchLinear(arr,key);
	}	
}