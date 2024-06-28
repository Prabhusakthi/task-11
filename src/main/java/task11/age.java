package task11;

class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class age {
	    public static void main(String[] args) {
	        try {
	            int age = 15; // Sample age input
	            validateAge(age);
	            System.out.println("Age is valid.");
	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    // Method to validate age
	    public static void validateAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Age must be at least 18 years.");
	        }
	    }
	}






