package task11;



	// Custom exception for incorrect password
	class IncorrectPasswordException extends Exception {
	    public IncorrectPasswordException(String message) {
	        super(message);
	    }
	}

	// User class representing users of the website
	class User {
	    private String username;
	    private String password;

	    public User(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    // Method to check password
	    public void checkPassword(String inputPassword) throws IncorrectPasswordException {
	        if (!password.equals(inputPassword)) {
	            throw new IncorrectPasswordException("Incorrect password entered!");
	        } else {
	            System.out.println("Login successful!");
	        }
	    }
	}

	public class loginsystem {
	    public static void main(String[] args) {
	        User user = new User("john_doe", "password123");

	        // Attempt to login with incorrect password
	        try {
	            user.checkPassword("wrong_password");
	        } catch (IncorrectPasswordException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Attempt to login with correct password
	        try {
	            user.checkPassword("password123");
	        } catch (IncorrectPasswordException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}




