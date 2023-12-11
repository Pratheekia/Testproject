import java.util.Scanner;

public class Linearsearch33 {

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
		System.out.println(Search33.linearSearch3 (arr,key));
	}

}
