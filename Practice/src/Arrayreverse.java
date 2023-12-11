
		import java.util.Scanner;

		public class Arrayreverse {

			public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println(" enter the size of an array");
			int [ ] arr=new int[scan.nextInt()];
			for(int i =0; i<=arr.length-1;i++)
				{
				arr[i]=scan.nextInt();
				}
			 for(int x:arr)
			 {
				
				 System.out.println(x + " ");
			 }
			 
			 for(int i=arr.length-1;i>=0; i--) {
				 System.out.println(arr[i]+ " ");
			 }
	}

}
