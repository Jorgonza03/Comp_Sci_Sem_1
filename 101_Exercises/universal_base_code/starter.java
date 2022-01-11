import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		

		Ascii creative = new Ascii();
		creative.setType("Creative");
		creative.setNumber(2);
		creative.setName("Trying to understand");
		creative.setAscii("-------->");
		creative.printArt();
		
		Ascii human = new Ascii();
		human.setType("human");
		human.setNumber(1);
		human.setName("Pain");
		human.setAscii("(0_0)");
		human.printArt();
		
		Ascii Dog = new Ascii();
		Dog.setType("Dog");
		Dog.setNumber(2);
		Dog.setName("More Pain");
		Dog.setAscii("<--------");
		Dog.printArt();
		
		Ascii Cactus = new Ascii();
		Cactus.setType("Cactus");
		Cactus.setNumber(2);
		Cactus.setName("Even More Pain");
		Cactus.setAscii("(-_-)");
		Cactus.printArt();
		
		
		
		
		



		
	}
}
