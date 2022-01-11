import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Input any integer");
		int num1 = sc.nextInt();
		System.out.println("Input another integer");
		int num2 = sc.nextInt();
		System.out.println("Input another integer");
		int num3 = sc.nextInt();
		
		if ((num1 < num2) && (num1 < num3))
			{
				System.out.println(num1 + " is the lowest integer");
			}
			
		if ((num3 < num1) && (num3 < num2))
			{
				System.out.println(num3 + " is the lowest integer");
			}
	
		if ((num2 < num1) && (num2 < num3))
			{
				System.out.println(num2 + " is the lowest integer");
			}
			
			
		if ((num1 > num2) && (num1 > num3))
			{
				System.out.println(num1 + " is the greatest integer");
			}
			
		if ((num3 > num1) && (num3 > num2))
			{
				System.out.println(num3 + " is the greatest integer");
			}
	
		if ((num2 > num1) && (num2 > num3))
			{
				System.out.println(num2 + " is the greatest integer");
			}
	
	
	}
}
