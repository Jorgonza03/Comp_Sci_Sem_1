import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random blank = new Random();
	int a = blank.nextInt(1000)+1;
	
	System.out.println("Guess a random number between 1 and 1000");
	int Guess = sc.nextInt();
	
	if (Guess == a)
		{
			System.out.println("Congrats, you guessed the right number");
		}
		else
		{
			System.out.println("You guessed the wrong number");
		}
	}
	
}
