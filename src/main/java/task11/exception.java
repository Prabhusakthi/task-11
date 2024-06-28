package task11;


	public class exception 
	{
		    public static void main(String[] args) {
		        // ArrayIndexOutOfBoundsException example
		        try {
		            int[] arr = new int[5];
		            // Accessing element at index 10 which doesn't exist
		            int value = arr[10];
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		        }

		        // StringIndexOutOfBoundsException example
		        try {
		            String str = "hello";
		            // Accessing character at index 10 which doesn't exist
		            char ch = str.charAt(10);
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
		        }
		    }
		}


