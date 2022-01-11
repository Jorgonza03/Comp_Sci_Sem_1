import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random blank = new Random();
		int [] x = new int [1000];
		
		int c = 0;
		while(c<1000)
		{
		int y = blank.nextInt(100) +1;
		x[c] = y;
		
		System.out.println(x[c]);
		if(c == 1000) 
			{
			break;
			}
		c = c + 1;


		}
	}
}
