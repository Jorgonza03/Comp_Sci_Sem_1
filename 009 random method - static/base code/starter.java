import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Random blank = new Random();
	int apple = blank.nextInt(9);
	System.out.println(apple);
	
	int bannana = blank.nextInt(100)+1;
	System.out.println(bannana);
	
	double Orange = blank.nextDouble()+2.5;
	System.out.println(Orange);
	
	int Cherry1 = blank.nextInt(589)+14;
	double Cherry = blank.nextDouble();
	System.out.print(Cherry1+Cherry);
	
	
	
	
	}
}

