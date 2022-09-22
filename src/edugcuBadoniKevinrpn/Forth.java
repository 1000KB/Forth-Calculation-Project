package edugcuBadoniKevinrpn;

/** This a public interface for Forth and is tied to the Forth Stack methods.
<p>
 * @author	Kevin Badoni <kcbadoni @ outlook.com>
 * @version	1.0
 * @since	2020-07-23
<p>
 * The interface is used like an outline of the methods and is meant to be the fore front of Forth.
 * The Forth interface is used for future changes to the Forth methods that are in Forth Stack. 
 * 
*/


public interface Forth 
{
	/**
	 * This interface is implemented by the Forth Stack.
	 * 
	<p>
	 * @author	Kevin Badoni <kcbadoni @ outlook.com>
	 * @version	1.0
	 * @param args	a String array of command line parameters;
	 *		may be empty.
	 * @since	2020-07-23
parameters;
	 *		may be empty.
	 * @since	2020-07-23
	<p>
	 * At the top of the methods is the add method and it gives ability to add variables.
	 * The second method is the sub method which provides subtraction capability.
	 * Third method is a multiplication method that gives multiplication results.
	 * Div method is a division method used to divide variables in the stack.
	 * Dup is a method that passes variables back as it holds a copy. 
	 * The twoDup is the same type as Dup but copies two types of variables.
	 * All these methods will use a double number format with the variables associated with it.

	*/

	public double add(double num1, double num2);	
	public double sub(double num1, double num2);
	public double mult(double num1, double num2);
	public double div(double num1, double num2);
	public double dup(double num1, double num2);
	public double twoDup(double num1, double num2);
	
}
