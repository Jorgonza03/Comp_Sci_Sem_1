import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("How many times do you want your name to be printed");
	int num = sc.nextInt();
	
	int c = 0;
	while(true)
	{
	System.out.println(name);
	if(c == num - 1) 
		{
		break;
		}
	c = c + 1;
	}


		
	}
}
