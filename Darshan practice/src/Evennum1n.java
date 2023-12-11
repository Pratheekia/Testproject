import java.util.Scanner;
public class Evennum1n {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the number");
    int n = scan.nextInt();
    for(int i=1;i<=n;i++)
    {
    	if(i%2==0)
    	{
    		System.out.println(i);
    	}
    }
   
      
	}}
 







//another method
//for(int i=2;i<=n;i+=2)
//{
//	System.out.println(i); 
//}

