package edugcuBadoniKevinrpn;

/** The Array Stack class is creating a compiled set of methods for stack functionality for a calculator application.
<p>
 * @author	Kevin Badoni <kcbadoni @ outlook.com>
 * @version	1.0
 * @since	2020-07-23
<p>
 * This Array Stack class will extend from the Abstract class as seen in the declaration of the class. 
 * The Array Stack has the methods used in the Abstract class and will be using these methods for values. 
 * 
*/

import java.lang.reflect.Array;



public class ArrayStack extends AbstractStack {
   
	/**
	 * This class Array Stack is a class used for the getting an array of data stacked on each other.
	 * It is a fundamental core for the expectations in the calculator.
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
	 * The fist set of variables that are used throughout the stack are maxSize, array and index.
	 * The class starts off with two constructors one with integer values that can configure the size of the array.
	 * The other constructor is a manual configuration.
	 * For the second it is a double push method that gets a value assigned by a variable to be added to the stack.
	 * A pop method is next to removes a value out of the stack.
	 * While another method, the isEmpty() is used to check if a stack is empty and returns a true or false.
	 * Next is a second Peek method that is meant to peek at the stack value.
	 * Then a clear method is used at the bottom for clearing values in a stack.

	*/
	
	public int maxSize;		
	public double [] array;	
	public int index;





	public ArrayStack(int size)    /**Constructor that is to the class. */
	{
		array = new double[size];	/** the constructor used here defines the variables differently than the other constructor below.*/
		index = -1;					
		maxSize = size;				
    }
	public ArrayStack() /** This second constructor uses a different set of values to the variables assigned and is set with fixed array size. */
	{
		array = new double[4];
		index = -1;
		maxSize = 4;
	}
             
    public double push(double item) 
    {							/** Double method used to get a value from a requesting class to move it to the array stack. */
    	if (!isFull()) 		/** the stack is first checked if it is not full and it will puts a value at the top of the stack. */
    	{				/** it is assigned the item variable for input and output of the variable and a print statement expects to see the value. */
    	   	array[++index] = item;	
    	   	System.out.println(item + " from array");
    	   	return item;
        }
    	else		/** if it is full then an exception is thrown showing an error the array is full. */
    		throw new StackOverflowError("Array Bounds Are exceeded: Too many items in array!");
 
    }

    public double pop(double item) 	
    { 								/** method checks if the stack is empty and will print out if it is. */
    		if (isEmpty()) 	
    		{
    			System.out.println("Stack is Empty");
    			/** when an exception is thrown it stops the progression of the program. */
    		}
    		else{
    			item =array[index--];	/** if it is not empty it will pop the next item off the stack and return it. */
    			System.out.println(item + " from array pop ");
    		}
    return item;
    }

    public boolean isEmpty() 
    {					/** The stack is checked if it is empty with the method. */
    	if (index == -1) 
    	{					/** if it is below zero it is empty and true or it is false. */
    		return true;
    	}
    	return false;
    	
    	
    }

    public boolean isFull()  
    {						/** Method is created to return a true or false value on the stack for some testing. */
    	if (index == maxSize) 
    	{					/** This checks if the variable index equals the maxSize. */
    		return true;
    	}
    	return false;
    	
    }
    public double peek(int n) /** Method peeks at the top value in the stack. */
    {					/** It does so by checking if it is empty first and then and it is returning a value. */
    	if (isEmpty())	/** Then if it is not empty it will return the value to the user. */
    	{
    		return -1;
    	} 
    	else {
    	 	return (double)Array.getDouble(array, n);
    	}
    }
    
    public int count() 
    {					/** The count method checks the stack for any values and returns the number. */
    	return index + 1;
    }
    
    @Override
    public double peek()
    {					/** Peek method peeks as the other method and checks if it is not empty and if not it will show the value.*/
    	if (!isEmpty())
    	{
    		return array[index];
    	}
    	else {			/** If it is empty it will return the negative one value as proof. */
    	return -1;
    	}
    }
    

    public void clear() 
    {						/** Method removes the top value by one. */
    	index = -1;

    }
}

  