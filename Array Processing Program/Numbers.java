import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Jordan Tache-Smith
 * Student Number: 041114885
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * @author/Professor James Mwangi PhD. 
 * 
  */
public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;
	
	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Default Constructor
	 * Intializes a default array with a size of 5
	 */
	public Numbers() {
		numbers = new Float[5];
		numItems = 0;
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		numbers = new Float[size];
		numItems = 0;
	}
	
	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		if (getNumItems() == numbers.length) {
			System.out.println("Array full");
			return;
		}
		
	System.out.print("Enter value: ");
    if (!keyboard.hasNextFloat()) { // Check if the input is a float
    	System.out.println("...invalid input...try again...");
    	keyboard.next();
    	return;
    }
	float value = keyboard.nextFloat();
	numbers[getNumItems()] = value;
	numItems = getNumItems() + 1;
	}
	
	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		float sum = 0.0f;
		for (int i = 0; i < getNumItems(); i++) {
			sum +=numbers[i];
		}
		return (float) sum / getNumItems();
	}
	
	/**
	 * Finds the minimum, maximum, and mmax mod min values in the array
	 * @return a string representing the min, max, and max mod min values
	 */
	public String findMinMax() {
		
		float min = numbers[0];
		float max = numbers[0];
		
		for (int i = 1; i < getNumItems(); i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		return String.format("Minimum value is %.2f, Maximum value is %.2f, max mod min is %.2f, ", min, max, max % min);
	}
	
	/**
	 * Calculates the factorial of the maximum value in the array
	 * @return a string representing the factorial of the maximum value
	 */
	public String getFactorialMax() {
		float max = numbers[0];
		for (int i = 1; i < getNumItems(); i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		int maxInt = (int) max;
		
		int factorial = 1;
		for (int i = 1; i <= maxInt; i++) {
			factorial *= i;
		}
		return String.format("Factorial of max value is %d%n", factorial);
		}
	
/**
 * Overrides the toString method to return a string representation of the numbers array
 * @return a string representation of the numbers array
 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getNumItems(); i++) {
			sb.append(numbers[i].toString()).append("\n");
		}
		return "Numbers are:\n" + sb.toString();
	}

/**
 * Gets current getNumItems value
 * @return the numItems
 */
public int getNumItems() {
	return numItems;
}
	
}
