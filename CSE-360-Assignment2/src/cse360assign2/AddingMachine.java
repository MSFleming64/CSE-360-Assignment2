/**Matt Fleming
*CSE 360
*Assignment 2
*The AddingMachine class adds and subtracts values from the total and keeps
*a log of the changes.
*/

package cse360assign2;

/**
 * The Class AddingMachine.
 */
public class AddingMachine {
	
	/** Instantiates The total. */
	private int total;
	
	/** The transaction log. */
	private String transactionLog;

	/**
	 * Instantiates a new adding machine.
	 */
	public AddingMachine () {
		total = 0; //not needed - included for clarity
		transactionLog = "0";
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * Adds the value to total.
	 *
	 * @param value the value
	 */
	public void add (int value) {
		transactionLog = transactionLog + " + " + value + "";
		total = total + value;
		
	}

	/**
	 * Subtract the value from the total.
	 *
	 * @param value the value
	 */
	public void subtract (int value) {
		transactionLog = transactionLog + " - " + value + "";
		total = total - value;
	}

	/**
	 * Calls transaction log.
	 *
	 * @return the string
	 */
	public String toString () {
		return transactionLog;
	}

	/**
	 * Reset information back to default
	 */
	public void clear() {
		total = 0;
		transactionLog = "0";
	}
}