package task11;


	import java.util.Scanner;

	public class division {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        try {
	            double result = divide(num1, num2);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        }

	        scanner.close();
	    }

	    public static double divide(int num1, int num2) {
	        if (num2 == 0) {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	        return (double) num1 / num2;
	    }
	}





