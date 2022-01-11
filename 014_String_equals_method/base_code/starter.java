import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a role, either 'Wizard', 'Warrior', or a 'Rogue'.");
		String Role = sc.nextLine();
		String a = new String("Wizard");
		String b = new String("Warrior");
		String c = new String("Rogue");
		
		if (Role.equals("Wizard"))
		{
			System.out.println("Your role is the Wizard");
		}
		else if (Role.equals("Warrior"))
		{
			System.out.println("Your role is the Warrior");
		}
		else if (Role.equals("Rogue"))
		{
			System.out.println("Your role is the Rogue");
		}
		else
		{
			System.out.print("The role you have inputted is invalid");
		}
		
		
	}
}
