import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter the char symbol which  should to be printed");
         char ch = scan.next().charAt(0);
         /*using for loop
         for(int i=1;i<=n;i++)
         {
        	 System.out.println(ch);
         }
         */
        /* int i=1;
			while(i<=n);
			{
				System.out.print("ch");
				i++;
        	 
	}
	*/
         int i=1;
			do
			{
				System.out.print(ch);
				i++;
			}
			 while(i<=n);
	}
}
