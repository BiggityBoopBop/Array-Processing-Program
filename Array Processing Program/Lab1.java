import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Jordan Tache-Smith
 * Student Number:  041114885
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi PhD. 
 * 
  */
public class Lab1 {
	
	/**
	 * Displays the main menu options
	 */
	public static void displayMainMenu() {
		System.out.println("Please select one of the following:");
		System.out.println("1. Intitialize a default array");
		System.out.println("2. To specify the max size of the array");
		System.out.println("3. Add value to the array");
		System.out.println("4. Display values in the array");
		System.out.println("5. Display average of the values, minimum value, maximum value, max mod min, factorialMax");
		System.out.println("6. To Exit");
		System.out.print("> ");
		}
	/**
	 * Main method to handle user inputs and to test the Numbers class
	 * @param args Command Line arguements
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Numbers numbers = new Numbers();
		
//START WHILE LOOP		
while(true) {
    displayMainMenu();
    
    if (!keyboard.hasNextInt()) { // Check if the input is an integer
    	System.out.println("...invalid input...try again...");
    	keyboard.next();
    	continue;
    }
    
	int option = keyboard.nextInt();
	
	//START SWITCH CASE
	switch(option) {
	
	case 1: // Intializes the default array
    numbers = new Numbers(); 
	break;
	
	case 2: // Intializes an array with a fixed size
	System.out.print("Enter new size of array: ");
    if (!keyboard.hasNextInt()) { // Check if the input is an integer
    	System.out.println("...invalid input...try again...");
    	keyboard.next();
    	break;
    }
    
    int size = keyboard.nextInt();
    
    if (size <= 0) {//Ensures the created array is a valid size
    	System.out.println("ERROR: Array Size must be greater than 0");
    	break;
    }
    
    numbers = new Numbers(size);
    keyboard.nextLine();
	break;
	
	case 3: // Adds a value into the array
	numbers.addValue(keyboard);
    keyboard.nextLine();
	break;
	
	case 4: // Displays values currently in the array
	System.out.println(numbers);
    break;
    
	case 5: // Gets avg, min, max, max mod min, factorial max.
		if (numbers.getNumItems() == 0) { // Checks if array has any values to use
			System.out.println("ERROR: Array is empty");
			break;
		}
		System.out.printf("Average is: %.2f, ", numbers.calcAverage());
		System.out.printf(numbers.findMinMax());
		System.out.printf(numbers.getFactorialMax());
    break;
    
	case 6: //Exits program
		System.out.println("Exiting...");
	return;
	
	default: //If the input isnt 1-6 this will print
		System.out.println("...invalid input...try again...");
		break;
}//END SWITCH CASE
}//END WHILE LOOP
	}
}

