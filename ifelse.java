package Java;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		
		int password = 50458;
		
		Scanner sc = new Scanner(System.in);
		
		int check = sc.nextInt();
		
		if(password == check) {
			System.out.println("Password is Correct!");
		}
		
		else {
			System.out.println("Password is Incorrect!");
		}

	}

}
