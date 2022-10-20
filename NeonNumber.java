import java.io.*;
class GFG {	
	public static boolean checkNeon(int n)
	{	
		int square = n * n;
		int sum = 0;	
		while (square > 0) {	
			int r = square % 10;		
			sum += r;		
			square = square / 10;
		}		
		if (sum == n)		
			return true;
		else
			return false;
	}	
	public static void main(String[] args)
	{		
		int n = 9;		
		if (checkNeon(n))			
			System.out.println("Given number " + n
							+ " is Neon number");
		else			
			System.out.println("Given number " + n
							+ " is not a Neon number");
	}
}
