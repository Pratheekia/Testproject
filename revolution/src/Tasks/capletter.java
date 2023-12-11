package Tasks;

import java.util.Scanner;

public class capletter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scan.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
        	System.out.println("cap letter");
        }
        else
        {
        	System.out.println("other character");
        }

	}

}
