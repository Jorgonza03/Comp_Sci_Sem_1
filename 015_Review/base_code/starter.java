import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
		System.out.println("What is your username?");
		String name = sc.nextLine();	
		System.out.println("What is your title? Ex. Slayer of Dragons");
		String title = sc.nextLine();
		
			
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
		
		System.out.println("You have 25 points to spend. You may Choose the following traits and put a maximum of 10 points in each.");
		System.out.println("Strength - Buff and able to carry larger items");
		System.out.println("Dexterity - Agile and moves quick");
		System.out.println("Intelligence - Better at magic spells!");
		System.out.println("Constitution - How much health");
		System.out.println("Charisma - How personable");
		
		
		int Points = 25;
		System.out.println("Input up to 10 points in Strength");
		int d = sc.nextInt();
		if (d > 10)
			System.out.println("The amount of points you have inputted is invalid");
		int y = (Points - d);
		System.out.println("you have " + y + " points remaining");
		 
			System.out.println("Input up to 10 points in Dexterity");
		int e = sc.nextInt();
		if (e > 10)
			System.out.println("The amount of points you have inputted is invalid");
		int x = (y - e);
		if (x < 0)
			System.out.println("You cannot input any more points");
		System.out.println("you have " + x + " points remaining");
		
		System.out.println("Input up to 10 points in Intelligence");
		int f = sc.nextInt();
		if (f > 10)
			System.out.println("The amount of points you have inputted is invalid");
		int w = (x - f);
		if (w < 0)
			System.out.println("You cannot input any more points");
		System.out.println("you have " + w + " points remaining");
		
			System.out.println("Input up to 10 points in Constitution");
		int g = sc.nextInt();
		if (g > 10)
			System.out.println("The amount of points you have inputted is invalid");
		int v = (w - g);
		if (v < 0)
			System.out.println("You cannot input any more points");
		System.out.println("you have " + v + " points remaining");
		
			System.out.println("Input up to 10 points in Charisma");
		int h = sc.nextInt();
		if (h > 10)
			System.out.println("The amount of points you have inputted is invalid");
		int u = (v - h);
		if (u < 0)
			System.out.println("You cannot input any more points");
		
		
		System.out.println("You are " + name + ", " + title + " of cvhs. Your role is " + Role);
		System.out.println("You have " + d + " points in Strength");
		System.out.println("You have " + e + " points in Dexterity");
		System.out.println("You have " + f + " points in Intelligence");
		System.out.println("You have " + g + " points in Constitution");
		System.out.println("You have " + h + " points in Charisma");
		System.out.println("Goodluck on your quest!");
		
		
		
		
		
	
	
	}
}
