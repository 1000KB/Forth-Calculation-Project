package edugcuBadoniKevinrpn;

/**
 * The ForthStack class is used to get calculated results to the user.
<p>
 * @author	Kevin Badoni <kcbadoni @ outlook.com>
 * @version	1.0
 * @since	2020-07-23
<p>
 * The class is used to establish methods that give an output regarding the name. 
 * In doing so the class associates itself with the ArrayStack and Forth by implementing and extends.
*/ 

import java.util.NoSuchElementException;



public abstract class ForthStack extends ArrayStack implements Forth {
	
	/**
	 * ForthStack is a class second in core functionality with the ArrayStack being the first.
	 * ForthStack relies upon the ArrayStack methods and gets results from using the methods.
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
	 * Variables are assigned to the class and are based on input and output.
	 * A constructor makes an array with some values to which the class methods can be used in TestForth and RPN.
	 * The methods below it are using the ArrayStack and are all using push, pop, and peek to give results.
	 * The first method is the add() with a two double inputs.
	 * Second is the subtraction method that pushes the result back to the class calling it.
	 * The multiplication method is next and it gives an output for that expectation.
	 * Div() is next and gives results from dividing two variables.
	 * Next is the Dup() that is giving a duplicate copy to the stack while returning another.
	 * The twoDup() after does the same but it does two copies of both values it receives.
	 * Another method is the getPi() which multiplies a variable of pi with another variable.
	 * Then getSq() is after and it multiplies a values placed from the RPN class.
	 * GetFact() is a method used but does not need to be use because it does no calculation but pushes a variable in and pops it back out.  

	*/
	
	double num1,num2;
	static double retX;
	double item;
	
	public ForthStack(int x)
	{
		array = new double [x];
		index = -1;
		maxSize = x;
	}	
	@Override 
	public double add(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
		try
		{							/** Method set the ArrayStack and pushes the variables in and pops out the result to retX. */
			xstack.push(num1 + num2);							
		 retX = Double.valueOf(xstack.pop(item));
		 System.out.println(retX + " from Forthstack ");
		return retX;
		}
	catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
	{
		throw e;
	}
		
	}
	
	public double sub(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
		try						/** Method gets the values assigned to the variables and subtracts them and pops out result. */
		{
			xstack.push(num1 - num2);	
			retX = Double.valueOf(xstack.pop(item));
			System.out.println(retX);
		return retX;							
		}
	catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
	{
		throw e;
	}
		
	}
	
	public double mult(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
		try									/** Method gets the variables and returns the result that is multiplied.*/
		{
			xstack.push(num1 * num2);   	
			retX = Double.valueOf(xstack.pop(item));
			System.out.println(retX);
		return retX;
		}
	catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
	{
		throw e;
	}
	}
	
	public double div(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
		try							/** div() gives an output pop that is two variables divided. */
		{
			xstack.push(num1 / num2);	
			retX = Double.valueOf(xstack.pop(item));
			System.out.println(retX);
		return retX;
		}
	catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
	{
		throw e;
	}
	}
	
	public double dup(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
		try									/** Method gets a variable and pushes one number while popping it.*/
		{						/** The method then sends another variable and another copy of the first variable.*/
			xstack.push(num1);	/** The first value is then peeked and that is returned. */
			xstack.pop(item);
			xstack.push(num2);
			xstack.push(num1);
			retX = Double.valueOf(xstack.peek());
			System.out.println(retX);
			return retX;
		}
		catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack. */
		{
			throw e;
		}
	}
	
	public double twoDup(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
		try								/** The twoDup() does the same as abode except peeks are implemented in between. */
		{						/** The end has the peek of the values. */
			xstack.push(num1);
			System.out.println(xstack.peek());
			xstack.push(num2);
			System.out.println(xstack.peek());
			xstack.pop(item);
			xstack.pop(item);
			xstack.push(num1);
			System.out.println(xstack.peek());
			xstack.push(num2);
			retX = xstack.peek();
			System.out.println(retX);
			return retX;
		}
		catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
		{
			throw e;
		}
	}
	public double getPi(double num1, double numpi) {
		ArrayStack xstack= new ArrayStack();
									/** getPi() is multiplying two variables but one is assigned the Pi in the RPN method.*/
		try
		{
			xstack.push(num1 * numpi);
			retX = Double.valueOf(xstack.pop(item));
			System.out.println(retX);
			return retX;
		}
		catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
		{
			throw e;
		}
	}
	public double getSq(double num1, double num2) {
		ArrayStack xstack= new ArrayStack();
												/** getSq() is used to multiply two variables.*/
		try								/** The two variables are the same value just copied from the other in the RPN class.*/
		{
			xstack.push(num1 * num2);
			retX = Double.valueOf(xstack.pop(item));
			System.out.println(retX);
			return retX;
		}
		catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
		{
			throw e;
		}
	}
	public double getFact(double num1) {
		ArrayStack xstack= new ArrayStack();
								/** the getFact() has no calculation and just pushes in and out a value.*/
		try
		{
			xstack.push(num1);
			retX = Double.valueOf(xstack.pop(item));
			return retX;
		}
		catch (NoSuchElementException e)		/**throws an exception if there is no element in the stack.*/
		{
			throw e;
		}
	}
	
	
	
}
	



