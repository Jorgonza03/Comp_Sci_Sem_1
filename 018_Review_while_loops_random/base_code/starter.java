import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Random blank = new Random();
		int secret = blank.nextInt(1000) + 1;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 and 1000 and if you are right you win");
	
	
	
	while(true)
	{
	int guess = sc.nextInt();
	if (guess != secret){
		System.out.println("You have guessed the wrong number, guess again" );
	
	}
	
	
		else 
		{
			System.out.println("Congrats, you win!");
		break;
		}

	}
	}
}
