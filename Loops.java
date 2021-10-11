package Java;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Sum = sc.nextInt();
		
		System.out.println("Multiplication Table of "+Sum+" is :");
		
		for(int i = 1; i <= 10; i++) {
		int M = Sum * i;
		System.out.println(M);
		
		}
		
		int num = 100;
        while (num <= 100){
            System.out.println(num);
            num = num + 1;

		}
	}

}
