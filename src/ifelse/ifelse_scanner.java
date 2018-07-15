

package ifelse;

//Java program to read data of various types using Scanner class.
import java.util.Scanner;

public class ifelse_scanner {

	public static void main(String[] args) {
		
		// Declare the object and initialise with predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // Numerical data input (int) - integer
        
        System.out.println("Enter your number");
        int num = sc.nextInt();
       
        // print imputed number
        System.out.println("Number: "+ num);
        
		// close the object
        sc.close(); 
			
        if (num < 100 && num >= 1) {
			System.out.println("it is a one or two digit number");
		} else if (num < 1000 && num >= 100) {
			System.out.println("it is a three digit number");
		} else if (num < 10000 && num >= 1000) {
			System.out.println("it is a four digit number");
		} else if (num < 100000 && num >= 10000) {
			System.out.println("it is a five digit number");
		} else if (num < 1000000 && num >= 100000) {
			System.out.println("it is a six digit number");
		} else if (num >= 1000000) {
				System.out.println("number has more than 6 digits");
	}
	
}
}
