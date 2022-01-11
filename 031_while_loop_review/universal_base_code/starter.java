import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random blank = new Random();
		int y = blank.nextInt(20);
		
		int c = 0;
		while(true)
		{
		int x = blank.nextInt(50);
		System.out.println(x);
		if(c == 100) 
			{
			break;
			}
		c = c + 1;


		}
	}
}
