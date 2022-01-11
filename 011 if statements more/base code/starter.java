import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Input any integer");
		int num1 = sc.nextInt();
		System.out.println("Input another integer");
		int num2 = sc.nextInt();
		
		if (num1 == num2)
			{
				System.out.println("Your integers are the same");
	
			}
		if (num1 != num2)
			{
				System.out.println("Your integers are different");
			}
		
		
		
		
	}
}
