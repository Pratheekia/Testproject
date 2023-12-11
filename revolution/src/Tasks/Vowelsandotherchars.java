package Tasks;

import java.util.Scanner;

public class Vowelsandotherchars {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scan.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
        	if(ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U')
        	{
        	System.out.println(" capital Vowels");
        }
        else
        {
        	System.out.println(" Capital constants");
        }
        }
        else if (ch>='a' && ch<='z')
        {
        	if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u')
        	{
        	System.out.println(" lower Vowels");
        }
        else
        {
        	System.out.println(" lower constants");
        }
        }
        else if (ch>='0' && ch<='9')
        {
        	System.out.println("digits");
        }
        else {
        	System.out.println("Special characters");
        }

	}

}
