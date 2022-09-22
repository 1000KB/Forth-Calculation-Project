package edugcuBadoniKevinrpn;

/** The Abstract class Abstract stack is for as a signature of the methods in the Array stack.
<p>
 * @author	Kevin Badoni <kcbadoni @ outlook.com>
 * @version	1.0
 * @since	2020-07-23
<p>
 * Abstract is considered as an outline of methods in the Array stack. 
 * Therefore it is used for an expectation of the Array stack. 
 * 
*/

public abstract class AbstractStack {
	
	/**
	 * This class AbstractStack is used to define what is associated to this superclass .
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
	 * The first set method the double peek method which is meant to look at the top values in the stack.
	 * Second method is the double push used to put a double value into the stack.
	 * Third method is a pop method that removes a value out of the stack.
	 * The isEmpty method is used in the stack to check if a stack is empty.
	 * Next is another peek method used for overloaded peek method.
	 * Last is the clear method used for removing all values in a stack. 

	*/
	
	
	public abstract double peek(int n);
	public abstract double push(double item);
	public abstract double pop(double item);
	public abstract boolean isEmpty();
	public abstract double peek();
	public abstract void clear();
}