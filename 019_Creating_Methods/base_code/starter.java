import java.util.Scanner;
import java.util.Random;

class starter {

	public static void toString(String A) {
		System.out.println(A);
		
		
	}
	
	
	public static void toStringCombined(String x, String y) {
		System.out.println(x + " " + y);
	
	}
		

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Write a sentence");
		String x1 = sc.nextLine();
		System.out.println("Write a sentence again");
		String y1 = sc.nextLine();
		System.out.println("This is using methods");
		toString(x1);
		toStringCombined(x1, y1);
		
		

	}
}
