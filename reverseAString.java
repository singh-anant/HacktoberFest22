import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		System.out.println("Enter the string to be reversed");
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		int length = original.length();
		for(int i=length-1; i&gt;=0; i--) {
			reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
		}
		System.out.println(reverse);
	}

}
