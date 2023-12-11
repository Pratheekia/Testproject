package Gcdmethod;

public class Gcd {

	public int gcdMethod(int m, int n) {
		if(n==0)
		{
			return m;
		}
		else {
			return gcdMethod(n,m%n);
		}
		
	}

}
