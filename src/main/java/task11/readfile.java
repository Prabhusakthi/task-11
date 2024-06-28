package task11;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class readfile {
	    public static void main(String[] args) {
	        try {
	            File file = new File("example.txt");
	            Scanner scanner = new Scanner(file);

	            // Read data from the file
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }

	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found. " + e.getMessage());
	        }
	    }
	}



