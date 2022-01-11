import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		String [] arr = new String[10];
		arr[0] = "bob sucks";
		for(String a : arr) {
			for(char b: a.toCharArray()){
				System.out.println(b);
			}
		}
	}
}
