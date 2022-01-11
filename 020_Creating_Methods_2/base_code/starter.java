import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static int power(int x, int y) {
		int a = 0;
		int z = x;
		while(a < y - 1) {
			z *= x;
			++a;
		}
		return z;
	}
		
	
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Input a integer");
		int base = sc.nextInt();
		System.out.println("Input an exponent");
		System.out.println(power(base, sc.nextInt()));



		
	}
}
