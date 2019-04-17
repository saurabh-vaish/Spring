import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		//System.out.println("Enter your email");
		String email ="saurbh@gmail.com";
		
		String pattern = "\\^([A-Za-z._%-]+@[A-Za-z0-9.-]+\\.[a-zA-Z] {2,6})*$";
		boolean b = Pattern.matches(pattern,email);
		System.out.println(b);
		

		
	}
}
