package Switch;

import java.util.Scanner;

public class controlswitch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		
		String n=scan.next();
		switch(n)
		{
		case "yashas" : System.out.println("yashas from hyderbad");
		                 break;
		case "sachin" : System.out.println("sachin from mumbai");
        break;
		case "dharshan" : System.out.println("dharshan from karnataka");
        break;
		case "giri" : System.out.println("giri from delhi");
        break;   
		default : System.out.println("Indian");
     
		}

	}

}
