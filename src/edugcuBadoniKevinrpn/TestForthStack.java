package edugcuBadoniKevinrpn;

/**
 * The Test Forth Stack class used to get the actual results of the methods involved with Forth and ArrayStack.
<p>
 * @author	Kevin Badoni <kcbadoni @ outlook.com>
 * @version	1.0
 * @since	2020-07-23
<p>
 * The class is designed to get user input for a value to check the capability of the results.
 * In doing so it will go through the input and check array stack functions.
 * It will proceed to the lower calls to the methods in the ForthStack. 
 * The class uses a scanner to get the user input.
*/ 


import java.util.Scanner;


public class TestForthStack
{
	 
	/**
	 * The TestForthStack class tests the methods from the ArrayStack and TestForthStack.
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
	 * The first variable is returnV which is used to get a return in the values associated with the input.
	 * As the program runs the output shows where the methods are performing. 
	 * The method starts with a scanner and printout with the ArrayStack being aligned with String Array input.
	 * As it progresses the indexes are checked to determine the character and filters a result through case.
	 * Then it pushes the values in response and checks the stack with peek, close, pop, count and isEmpty.
	 * Integers placed in the string at the beginning are assigned to the methods from the ForthStack. 
	 * This prints results and it also adds more system prints from the methods themselves serving as an assurance it performs.
	 * 

	*/
	
	
	static double returnV;

	public static void main(String[] args) 
	{	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Put you math problem: Ex. 2 3 +");
		
		ArrayStack aStack = new ArrayStack();
			String[] input = new String[3];
			for(int i=0; i<3; ++i) 
			{
				String userInput = sc.nextLine(); /** As values are added it starts from here and progresses down to the next line.*/
				userInput = userInput.replace(" ", "");	/** This line gets the white spaces out of the sequence of values.*/
				input[i]= userInput;		/** Both sets of data are aligned here with each other to get indexes in line. */
				System.out.println(userInput);
					
					char z= userInput.charAt(0);
					char y= userInput.charAt(1); /** This section assigns the indexes with a char variable.*/
					char x= userInput.charAt(2);
																/** It then goes to this section to get double variables.*/
					double a= Double.parseDouble(String.valueOf(z));
					double b= Double.parseDouble(String.valueOf(y));
					switch(x) {							/** The third char variable is sent to the switch to check what will be performed. */
					case '+':
						aStack.push(Double.valueOf(a + b));
						break;
					case '-':
						aStack.push(Double.valueOf(a - b));
						break;
					case '*':
						aStack.push(Double.valueOf(a * b));
						break;
					case '/':
						aStack.push(Double.valueOf(a / b));
						break;
					}
				System.out.println("First Pop is: " + aStack.pop(x)); /** In this section multiple checks are done for state of the stack. */
				System.out.println("Second Pop is: " + aStack.pop(x));
				System.out.println("Checking if it is empty:" + aStack.isEmpty());
				System.out.println("Checking count: " + aStack.count());
				returnV=Double.valueOf(aStack.pop(x));
				System.out.println(returnV);
				aStack.clear();
				System.out.println("Checking if it is empty second time: " + aStack.isEmpty());
				System.out.println("Peeking on array: " + aStack.peek());
				System.out.println("Checking count: " + aStack.count());
				
													/** Following methods coming from ForthStack are checked for results.*/
         System.out.println("Adding two numbers (a + b) ");                      
		ForthStack testAddStack = new ForthStack(3) {
			public void add() {
			}
		};
		testAddStack.add(a,b);
		
		
		System.out.println("Subtracting two numbers ( a- b) ");
		ForthStack testSubStack = new ForthStack(3) {
			public void sub() {
			}
		};
		testSubStack.sub(a,b);
		
		
		System.out.println("Multipying two numbers ( a * b) ");
		ForthStack testMultStack = new ForthStack(3) {
			public void mult() {
			}
		};
		testMultStack.mult(a,b);
		
		
		System.out.println("Dividing two numbers ( a / b) ");
		ForthStack testDivStack = new ForthStack(3) {
			public void div() {
			}
		};
		testDivStack.div(a,b);
		
		 
		System.out.println("Dup with a and b ");
		ForthStack testDupStack = new ForthStack(3) {
			public void dup() {
			}
		};
		testDupStack.dup(a,b);
		
		
		System.out.println("Double dup with a and b ");
		ForthStack testDoubDupStack = new ForthStack(3) {
			public void twoDup() {
			}
		};
		testDoubDupStack.twoDup(a,b);
		
		
		
			}
	}
	
	
}