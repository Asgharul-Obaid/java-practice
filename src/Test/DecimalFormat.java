package Test;

public class DecimalFormat {
public static void main(String[] args) {
	 
	        int[] a = {10740206};

	        // Access the first element of the array
	        int number = a[0];

	        // Convert the number to a string and pad with leading zeros
	        String formattedNumber = String.format("%08d", number);

	        // Print the formatted number
	        System.out.println(formattedNumber);
	    }
	}