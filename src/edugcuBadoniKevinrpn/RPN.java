package edugcuBadoniKevinrpn;

/**
 * The RPN is a class that will launch a GUI as a calculator to use Forth and Array Stack methods.
<p>
 * @author	Kevin Badoni <kcbadoni @ outlook.com>
 * @version	1.0
 * @since	2020-07-23
<p>
 * The main basis of the program is to make a calculator that will function with an array stack and give output to simple math.
 * The program starts with importing swing JFrame and other components, which are used in construction of a GUI.
 * A major part of the program uses action listeners to call to functionality from other methods in external classes.
 * These external classes are associated with package edugcuBadoniKevinrpn this program is under.
 * 
*/ 

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RPN
{
	/**
	 * This class RPN is used to combine all classes that are going communicate as a Model View Controller design.
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
	 * The first set of variables are used to establish the communication of variables to other methods and classes.
	 * For example the retX is return x for short and is used for output of data in the Model class.
	 * The first class ViewCalc will be setting the components needed for the GUI.
	 * Communication methods are set to establish a connection to the button through action listeners.
	 * These listeners move to the Controller class and begin establishing data transfer to the model.
	 * The model uses outside methods in other classes from the ArrayStack and the ForthStack.
	 * As information comes back in it will be sent to the controller and back to an allocated text field in the GUI.
	 * 

	*/
												
	double num1;
	double num2;
	double retX;

	public class ViewCalc extends JFrame{							
		//* The start of the data here is defining the components being used to a variable and size */
		private JTextField dataEntry = new JTextField(20);
		private JLabel dataLabel = new JLabel("Input");
		private JTextField Display = new JTextField(15);
		private JLabel DisplayLabel = new JLabel("Display Output 1");
		private JTextField dispTwo = new JTextField(15);
		private JLabel DLabelTwo = new JLabel("Display Output 2");
		private JTextField dispThr = new JTextField(15);
		private JLabel DLabelThr = new JLabel("Display Output 3");
		private JTextField dispFour = new JTextField(15);
		private JLabel DLabelFour = new JLabel("Display Output 4");
		private JTextField dispFive = new JTextField(15);
		private JLabel DLabelFive = new JLabel("Display Output 5");
		private JTextField dispSix = new JTextField(15);
		private JLabel DLabelSix = new JLabel("Display Output 6");
		private JTextField dispSeven = new JTextField(15);
		private JLabel DLabelSeve = new JLabel("Display Output 7");
		private JTextField dispEight = new JTextField(15);
		private JLabel DLabelEigh = new JLabel("Display Output 8");
		private JTextField dispNine = new JTextField(15);
		private JLabel DLabelNine = new JLabel("Display Output 9");
		private JTextField dispTen = new JTextField(15);
		private JLabel DLabelTen = new JLabel("Display Output 10");
		private JTextField Error = new JTextField(20);
		private JLabel errorLabel = new JLabel("Errors");
		
		//* This section defines the variables connected to the buttons and gives labels*/
		private JButton buttonPush = new JButton("push");
		private JButton buttonPop = new JButton("pop");
		private JButton buttonClr = new JButton("clr");
		private JButton buttonAdd = new JButton("+");
		private JButton buttonSubtract = new JButton("-");
		private JButton buttonMult =  new JButton("*");
		private JButton buttonDiv = new JButton("/");
		private JButton buttonDup = new JButton("dup");
		private JButton buttonTwoDup = new JButton("twoDup");
		private JButton piButton = new JButton("pi");
		private JButton sqButton = new JButton("x2");
		private JButton nButton = new JButton("n!");
		private JButton powButton = new JButton("^");
		
			ViewCalc() {
		//* A constructor is made to make variables and methods instantiated for the object it is creating */	
				//*The first thing made is the JPanel to all components set with the labels associated to text fields*/
				JPanel calcPanel= new JPanel();
				
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setSize(300, 750);
				dataLabel.setLabelFor(dataEntry);
				DisplayLabel.setLabelFor(Display);
				errorLabel.setLabelFor(Error);
				DLabelTwo.setLabelFor(dispTwo);
				DLabelThr.setLabelFor(dispThr);
				DLabelFour.setLabelFor(dispFour);
				DLabelFive.setLabelFor(dispFive);
				DLabelSix.setLabelFor(dispSix);
				DLabelSeve.setLabelFor(dispSeven);
				DLabelEigh.setLabelFor(dispEight);
				DLabelNine.setLabelFor(dispNine);
				DLabelTen.setLabelFor(dispTen); 
				
		//* Buttons are then given a size*/		
				buttonAdd.setPreferredSize(new Dimension(70,50));
				buttonSubtract.setPreferredSize(new Dimension(70, 50));
				buttonMult.setPreferredSize(new Dimension(70, 50));
				buttonDiv.setPreferredSize(new Dimension(70, 50));
				buttonDup.setPreferredSize(new Dimension(70, 50));
				buttonTwoDup.setPreferredSize(new Dimension(70, 50));
				buttonPush.setPreferredSize(new Dimension(70, 50));
				buttonPop.setPreferredSize(new Dimension(70, 50));
				buttonClr.setPreferredSize(new Dimension(70, 50));
				piButton.setPreferredSize(new Dimension(70, 50));
				sqButton.setPreferredSize(new Dimension(70, 50));
				nButton.setPreferredSize(new Dimension(70, 50));
				powButton.setPreferredSize(new Dimension(70, 50));
				
		//* The following establishes the adding of the components on the panel and it starts from top to bottom */				
				calcPanel.add(dataLabel);
				calcPanel.add(dataEntry);
				calcPanel.add(DisplayLabel);
				calcPanel.add(Display);
				
				calcPanel.add(DLabelTwo);
				calcPanel.add(dispTwo);
				calcPanel.add(DLabelThr);
				calcPanel.add(dispThr);
				calcPanel.add(DLabelFour);
				calcPanel.add(dispFour);
				calcPanel.add(DLabelFive);
				calcPanel.add(dispFive);
				calcPanel.add(DLabelSix);
				calcPanel.add(dispSix);
				calcPanel.add(DLabelSeve);
				calcPanel.add(dispSeven);
				calcPanel.add(DLabelEigh);
				calcPanel.add(dispEight);
				calcPanel.add(DLabelNine);
				calcPanel.add(dispNine);
				calcPanel.add(DLabelTen);
				calcPanel.add(dispTen);
				calcPanel.add(errorLabel);
				calcPanel.add(Error);
				
				calcPanel.add(buttonAdd);
				calcPanel.add(buttonSubtract);
				calcPanel.add(buttonMult);
				calcPanel.add(buttonDiv);
				calcPanel.add(buttonDup);
				calcPanel.add(buttonTwoDup);
				calcPanel.add(buttonPush);
				calcPanel.add(buttonPop);
				calcPanel.add(buttonClr);
				calcPanel.add(piButton);
				calcPanel.add(sqButton);
				calcPanel.add(nButton);
				calcPanel.add(powButton);
				this.add(calcPanel);
			}
	//* The following methods provide an index that is can be used to send specific parts of a string to the controller */
			//* The first two methods are used for small calculations */
			public double seperInd(double num1) {					//* Extracting Index 0  */
				String a=dataEntry.getText();		//* Using the get text from the text field and giving it a variable starts this method */
					String[] da=new String[2];	//* A string array is created and put in a for loop */
					for(int i=0; i<2; ++i)
						da[i]=a;					//* The array is aligned with the string and given a variable*/
					char ak=a.charAt(0);				//* A variable is then parsed to create a double variable that will be returned */
					num1 = Double.parseDouble(String.valueOf(ak));
					return num1;	
			}
			
			public double seperateInd(double num2) {				//* Index 1 */
				String a=dataEntry.getText();
					String[] da=new String[2];			//* The following method does the same as above except it retrieves the number on index 1*/
					for(int i=0; i<2; ++i)
						da[i]=a;
					char ak=a.charAt(0);
					char av=a.charAt(1);
					num1= Double.parseDouble(String.valueOf(ak));
					num2= Double.parseDouble(String.valueOf(av));
					return num2;	
			}
	//* These next methods are used for the pop and push in the Array stack */		
			public double sepInd3(double num3) {					//* Index 2 */
				String a=dataEntry.getText();
					String[] da=new String[9];		//* It is the same as above and this extracts the Index 2*/
					for(int i=0; i<3; ++i)
						da[i]=a;
					char ak=a.charAt(0);
					char av=a.charAt(1);
					char al=a.charAt(2);
					num3= Double.parseDouble(String.valueOf(al));
					return num3;	
			}
			public double sepInd4(double num4) {					//* Index 3 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<3; ++i)
						da[i]=a;
					char am=a.charAt(3);
					char an=a.charAt(4);
					char ao=a.charAt(5);
					num4= Double.parseDouble(String.valueOf(am));
					return num4;
			}
			public double sepInd5(double num5) {					//* Index 4 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<3; ++i)
						da[i]=a;
					char am=a.charAt(3);
					char an=a.charAt(4);
					char ao=a.charAt(5);
					num5= Double.parseDouble(String.valueOf(an));
					return num5;
			}
			public double sepInd6(double num6) {					//* Index 5 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<3; ++i)
						da[i]=a;
					char am=a.charAt(3);
					char an=a.charAt(4);
					char ao=a.charAt(5);
					num6= Double.parseDouble(String.valueOf(ao));
					return num6;
			}
			public double sepInd7(double num7) {					//* Index 6 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<3; ++i)
						da[i]=a;
					char ap=a.charAt(6);
					char aq=a.charAt(7);
					char ar=a.charAt(8);
					num7= Double.parseDouble(String.valueOf(ap));
					return num7;
			}
			public double sepInd8(double num8) {					//* Index 7 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<3; ++i)
						da[i]=a;
					char ap=a.charAt(6);
					char aq=a.charAt(7);
					char ar=a.charAt(8);
					num8= Double.parseDouble(String.valueOf(aq));
					return num8;
			}
			public double sepInd9(double num9) {					//* Index 8 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<3; ++i)
						da[i]=a;
					char ap=a.charAt(6);
					char aq=a.charAt(7);
					char ar=a.charAt(8);
					num9= Double.parseDouble(String.valueOf(ar));
					return num9;
			}
			public double seperInd10(double num10) {					//*Index 9 */
				String a=dataEntry.getText();
					String[] da=new String[9];
					for(int i=0; i<2; ++i)
						da[i]=a;
					char as=a.charAt(9);
					num10 = Double.parseDouble(String.valueOf(as));
					return num10;
			}
	//* The following methods are making communication by sending double numbers to the Controller */		
			public double getNumA(double num1) {
				return Double.parseDouble(dataEntry.getText());
			}
			public double getNumB(double num2) {
				return Double.parseDouble(dataEntry.getText());
			}
	//* This method erase the text in a text field when implemented */
			public void setErase() {
				dataEntry.setText("  ");
			}
	//* These other methods are used to send numbers to specific displays and are used in the controller */
			public double getCalOutSolution() {					//* Display 1 */
				return Double.parseDouble(Display.getText());	//* The methods are getting and setting results */
			}
			public void setCalOutSolution(double retX) {
				Display.setText(Double.toString(retX));
			}
			public double getDisTwo() {							//* Display 2 */
				return Double.parseDouble(dispTwo.getText());
			}
			public void setDisTwo(double retX) {
				dispTwo.setText(Double.toString(retX));
			}
			public double getDisThree() {						//* Display 3 */
				return Double.parseDouble(dispThr.getText());
			}
			public void setDisThree(double retX) {
				dispThr.setText(Double.toString(retX));
			}
			public double getDisFour() {						//* Display 4 */
				return Double.parseDouble(dispFour.getText());
			}
			public void setDisFour(double retX) {
				dispFour.setText(Double.toString(retX));
			}
			public double getDisFive() {						//* Display 5 */
				return Double.parseDouble(dispFive.getText());
			}
			public void setDisFive(double retX) {
				dispFive.setText(Double.toString(retX));
			}
			public double getDisSix() {						//* Display 6 */
				return Double.parseDouble(dispSix.getText());
			}
			public void setDisSix(double retX) {
				dispSix.setText(Double.toString(retX));
			}
			public double getDisSeven() {						//* Display 7 */
				return Double.parseDouble(dispSeven.getText());
			}
			public void setDisSeven(double retX) {
				dispSeven.setText(Double.toString(retX));
			}
			public double getDisEight() {						//* Display 8 */
				return Double.parseDouble(dispEight.getText());
			}
			public void setDisEight(double retX) {
				dispEight.setText(Double.toString(retX));
			}
			public double getDisNine() {						//* Display 9 */
				return Double.parseDouble(dispNine.getText());
			}
			public void setDisNine(double retX) {
				dispNine.setText(Double.toString(retX));
			}
			public double getDisTen() {						//* Display 10 */
				return Double.parseDouble(dispTen.getText());
			}
			public void setDisTen(double retX) {
				dispTen.setText(Double.toString(retX));
			}
			
	//* Following methods are the listeners used for specific buttons and are called to generate a result by the controller class */
			
			void pushCalcListener(ActionListener listen) {			//* Push Listener */
				buttonPush.addActionListener(listen);		//* The buttonPush is associated to this action listener */
			}	
			void popCalcListener(ActionListener listen) {			//*  Pop  */
				buttonPop.addActionListener(listen);
			}
			void clrCalcListener(ActionListener listen) {		//* Clear */
				buttonClr.addActionListener(listen);
			}
			void addCalcListener(ActionListener listen) {		//*  Add  */
				buttonAdd.addActionListener(listen);
			}
			void subtraCalcListener(ActionListener listen) {	//* Subtract  */
				buttonSubtract.addActionListener(listen);
			}
			void multipCalcListener(ActionListener listen) {	//*  Multiplication */
				buttonMult.addActionListener(listen);
			}
			void diviCalcListener(ActionListener listen) {		//* Division */
				buttonDiv.addActionListener(listen);
			}
			void dupCalcListener(ActionListener listen) {		//*  Dup  */
				buttonDup.addActionListener(listen);
			}
			void doubDupCalcListener(ActionListener listen) {		//*  Double DUP */
				buttonTwoDup.addActionListener(listen);
			}
			void piCalcListener(ActionListener listen) {		//* Pi Listener */
				piButton.addActionListener(listen);
			}
			void sqCalcListener(ActionListener listen) {		//* SQ Listener */
				sqButton.addActionListener(listen);
			}
			void nCalcListener(ActionListener listen) {		//* factorial Listener */
				nButton.addActionListener(listen);
			}
			void powerCalcListener(ActionListener listen) {		//* Power Listener */
				powButton.addActionListener(listen);
			}
			
			void showErrors(String errorMessage) {		//*  Error */
				Error.setText(errorMessage);			//* The error box is connected to the controller for occurring errors */
			}
		}
	
	//* The following class is the controller and is used to get the results to text fields that are implemented by action listeners*/
	public class CalController{
		//* Variables are created to the other classes and a constructor is created to set the class name used with action listeners*/
		private ViewCalc theView;
		private CalModel theModel;
		
		public CalController(ViewCalc theView, CalModel theModel) {
			
			this.theView =theView;
			this.theModel =theModel;
			
			this.theView.pushCalcListener(new pushBuListener());
			this.theView.popCalcListener(new popBuListener());
			this.theView.clrCalcListener(new clrBuListener());
			this.theView.addCalcListener(new addBuListener());
			this.theView.subtraCalcListener(new subBuListener());
			this.theView.multipCalcListener(new multiBuListener());
			this.theView.diviCalcListener(new divBuListener());
			this.theView.dupCalcListener(new dupBuListener());
			this.theView.doubDupCalcListener(new douDupBuListener());
			this.theView.piCalcListener(new piBuListener());
			this.theView.sqCalcListener(new sqBuListener());
			this.theView.nCalcListener(new nBuListener());
			this.theView.powerCalcListener(new powBuListener());	
		}
		//* The first class met for the push in the array stack */
			class pushBuListener implements ActionListener {	//* Push */
			
				public void actionPerformed(ActionEvent e) {
																//* Multiple variables are made to set initialing it for try block */
					double num1,num2,num3; num1=num2=num3=0;
					double num4,num5,num6; num4=num5=num6=0;
					double num7,num8,num9,num10; num7=num8=num9=num10=0;
					try				//* The try block has set the actions that will be generated as a number is extracted */
					{
						num1=theView.seperInd(num1);	//* First num1 value is created by extracting string from first method for index0*/
						theView.getNumA(num1);		//* This extracts the number further and sends it to the model */
						theModel.pushNum(num1);		//* The number is the sent to pushNum method in Model class */
						theView.setDisTen(theModel.getCalculatedValue());	//* As it comes back it is sent back to specific display text field */
						num2=theView.seperateInd(num2);
						theView.getNumB(num2);					//* Everything is done again the same again for num2 */
						theModel.pushNum(num2);
						theView.setDisNine(theModel.getCalculatedValue());
						num3=theView.sepInd3(num3);				//* It is the same with num3 */
						theView.getNumA(num3);
						theModel.pushNum(num3);
						theView.setDisEight(theModel.getCalculatedValue());
						num4=theView.sepInd4(num4);
						theView.getNumB(num4);
						theModel.pushNum(num4);
						theView.setDisSeven(theModel.getCalculatedValue());
						num5=theView.sepInd5(num5);
						theView.getNumA(num5);
						theModel.pushNum(num5);
						theView.setDisSix(theModel.getCalculatedValue());
						num6=theView.sepInd6(num6);
						theView.getNumB(num6);
						theModel.pushNum(num6);
						theView.setDisFive(theModel.getCalculatedValue());
						num7=theView.sepInd7(num7);
						theView.getNumA(num7);
						theModel.pushNum(num7);
						theView.setDisFour(theModel.getCalculatedValue());
						num8=theView.sepInd8(num8);
						theView.getNumB(num8);
						theModel.pushNum(num8);
						theView.setDisThree(theModel.getCalculatedValue());
						num9=theView.sepInd9(num9);
						theView.getNumA(num9);
						theModel.pushNum(num9);
						theView.setDisTwo(theModel.getCalculatedValue());
						num10=theView.seperInd10(num10);
						theView.getNumB(num10);
						theModel.pushNum(num10);
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {		//* A catch block is made to get an error sent back to its allocated text field */
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					}
				}	
			}
				//* The class below establishes the same expectations of a action listener for Pop */
			class popBuListener implements ActionListener {		//* POP */

				public void actionPerformed(ActionEvent e) {
					double num1,num2,x; num1=num2=x=0;
					try								//* Variables are set then a try block starts pulling from the first method from the view */
					{								//* This says there two variables num1 and num2 that are input to get the value and pop them out*/
						num1=theView.seperInd(num1);
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);			//* It further gets the same from NumA() and sends to popNum() that will be used */
						theView.getNumB(num2);
						theModel.popNum(x);			//* Implements the connected array stack pop() method and this executes clearing of values in display */
						theView.setCalOutSolution(theModel.getCalculatedValue());	//* The variable in the display are them popped off the text field */
						theView.setDisTwo(theModel.getCalculatedValue());
						theView.setDisThree(theModel.getCalculatedValue());
						theView.setDisFour(theModel.getCalculatedValue());
						theView.setDisFive(theModel.getCalculatedValue());
						theView.setDisSix(theModel.getCalculatedValue());
						theView.setDisSeven(theModel.getCalculatedValue());
						theView.setDisEight(theModel.getCalculatedValue());
						theView.setDisNine(theModel.getCalculatedValue());
						theView.setDisTen(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					}
				}
			}
			
			class clrBuListener implements ActionListener {		//*  CLEAR  */
															//* This performs a clearing of the text field */
				public void actionPerformed(ActionEvent e) {
					theView.setErase();						//* The erase() is used in the view to remove numbers in the text field */	
					theModel.removeNum();		//* It uses the array stack clear() with a setErase() in the model*/
					
				}
			}
			
			class addBuListener implements ActionListener {		//*  ADD  */
															//* The method reacts to the add button */
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;
					try										//* It uses an addNum() in the model to the add() in Forth stack*/
					{
						num1=theView.seperInd(num1);
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.addNum(num1,num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					
					}
				}
			}

			class subBuListener implements ActionListener {		//*	SUB  */
														//* The method is the same as others except it is calling a sub() method in Forth stack */
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;
					try
					{
						num1=theView.seperInd(num1);
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.subNum(num1,num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					
				}
				}
			}
			class multiBuListener implements ActionListener {	//*  MULTI  */
													//* Method in this class is used to multiply numbers  */
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;
					try
					{							//* The following try block is usign two inputs to output to mulNum() in the Model */
						num1=theView.seperInd(num1);
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.mulNum(num1, num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					}
				}
			}
			class divBuListener implements ActionListener {		//*  DIV  */
													//* The method has the same requirements that sends input to a method */
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;	//* It then becomes an output as divNum() is implemented */
					try
					{
						num1=theView.seperInd(num1);
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.divNum(num1, num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");	
					}
				}
			}
			class dupBuListener implements ActionListener {		//*  DUP  */
				
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;
					try									//* This class makes this method respond to Dup button which uses the View to send data*/
					{								//* As the data moves to the model dupNum() in the model it brings back results */
						num1=theView.seperInd(num1);	//* The results are then moved up to the output text field */
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.dupNum(num1, num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					
					}
				}
			}
			class douDupBuListener implements ActionListener {	//*  DOUBLE DUP  */
				
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;
					try								//* The douDupBuListener sets an action from the twoDup button */
					{								//* It is similar to the Dup method but it is a doubled action result in doubleDupNum() */
						num1=theView.seperInd(num1);
						num2=theView.seperateInd(num2);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.doubleDupNum(num1, num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");	
					}	
				
				}
			}
			class piBuListener implements ActionListener {		//*  PI   */
				
				public void actionPerformed(ActionEvent e) {
					double num1; num1=0;				//* The Pi listener here uses a numpi variable set with a value*/
					double numpi=3.14159265358979323846;  //* In doing so it will calculate the num1 with it as it represents a diameter input */
					try								//* As variable num1 is pulled to piNum() it also takes the numpi variable */
					{								//* A value is then calculated and pushed from that a method in Forth Stack*/
						num1=theView.seperInd(num1);
						theView.getNumA(num1);
						theModel.piNum(num1,numpi);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					
					}
				}
			}
			class sqBuListener implements ActionListener {		//*  SQUARE or x2  */
				
				public void actionPerformed(ActionEvent e) {
					double num1; num1=0;			//* The method returns a value of num1 multiplying against itself */
					double num2; num2=0;		//* This is done by giving a num2 value a second time from the same input */
					try
					{								//* It is then sent to sqNum() at the model to calculate and push out a value */
						num1=theView.seperInd(num1);
						num2=theView.seperInd(num1);
						theView.getNumA(num1);
						theView.getNumB(num2);
						theModel.sqNum(num1,num2);
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					
					}
				}
			}
			class nBuListener implements ActionListener {		//*  Factorial  */
				
				public void actionPerformed(ActionEvent e) {
					double num1; num1=0;		//* The method is listening to factorial action and uses a loop to get the value needed */
											//* The loop take the num1 variable and equates it to the factor output from the loop */
					try					//* The num1 value taken from the input is also placed in the loop giving a range to loop in */
					{
						num1=theView.seperInd(num1);
						int i,factor=1;
						for(i=1;i<=num1;i++)
						{
							factor=factor*i;  
						} 
						num1=factor;
						theView.getNumA(num1);
						theModel.factNum(num1); //* This is the difference in all other methods with this line it is sending the value to factNum() */
						//* It does not need to generate a result by sending it to Forth stack through factNum() */
						
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: There needs to be two numbers.");
					
					}
				}
			}
			class powBuListener implements ActionListener {		//*  Power */
				
				public void actionPerformed(ActionEvent e) {
					double num1,num2; num1=num2=0;
													//* The listener for power implements close in comparison to the Factorial */
					try						//* It is different because it takes num2 input as the range in the loop */
					{						//* While it is num1 is calculated against the result and then assigned num1 with the result */
						num1=theView.seperInd(num1);	
						num2=theView.seperateInd(num2);
						int power=1;
						int i;
						for(i=1;i<=num2;i++)
						{
							power *= num1;  
						} 
						System.out.println(power);
						num1=power;
						theView.getNumA(num1);
						theModel.factNum(num1);		//* This is the difference in all other methods with this line it is sending the value to factNum() */
												//* It does not need to generate a result by sending it to Forth stack through factNum() */
						theView.setCalOutSolution(theModel.getCalculatedValue());
						
					} catch(NumberFormatException exc) {
						System.out.println(exc);
						theView.showErrors("ERROR: Only two numbers, power is second.");
					
					}
				}
			}
			
			
		}	
	
	//* This class is used as the model which receives output from the listener to a assigned variable */
	public class CalModel {
		
		public void pushNum(double item) {				//*  PUSH method with anonymous */
			ArrayStack arrayStack = new ArrayStack(9) {//* The method encapsulates the ArrayStack push() for use with calculation */
				public void push() {
					System.out.println(retX);		//* An output is taken and sent back to the controller which sends it to a text field */
				}								//* the output is sent as retX in the calculated value method at the bottom */
			}; retX=item;
			arrayStack.push(retX);
		}
		
		public double popNum(double item) {					//*  POP method with anonymous */
			ArrayStack arrayStack = new ArrayStack(9) {	//* Output from the method does the same as the method above excepts uses pop() */
				public void pop() {
					
				}
			}; retX=arrayStack.pop(item);
			return retX;
		}
		
		public void removeNum() {						//* Clear method with anonymous */
			ArrayStack remCLR = new ArrayStack() {	//* The method uses a clear() in the array stack */
				public void clear() {
					
				}
			};
			remCLR.clear();
		}
		
		public double addNum(double num1, double num2) {		//* Add method */
			ForthStack addingNum = new ForthStack(3) {		//* The method adds by retrieving output from add() in Forth stack */
				public void add() {
					
				}
			};
			retX=addingNum.add(num1, num2);
			return retX;
		}
		
		public double subNum(double num1, double num2) {	//*  Subtract method  */
			ForthStack subNum = new ForthStack(3) {		//* This method and all following methods have the same functionality and purpose */
				public void sub() {					//* to get an output from Forth stack*/
					
				}
			};
			retX = subNum.sub(num1, num2);
			return retX;
		}
		
		public double mulNum(double num1, double num2) {			//*Multiplication*/
			ForthStack multiplyNum = new ForthStack(3) {	//* Method pushes a multiplication result from Forth stack*/
				public void mult() {					//* Variables are given a result from the bottom of the method and sent to view*/
					
				}
			};
			retX = multiplyNum.mult(num1, num2);
			return retX;
		}
		
		public double divNum(double num1, double num2) {		//* Division */
			ForthStack dividingNum = new ForthStack(3) {	//* Dividing is executed by Forth stack as variables with an assigned value are sent */
				public void div() {
					
				}
			};
			retX = dividingNum.div(num1, num2);
			return retX;
		}
		
		public double dupNum(double num1, double num2) {		//*  Dup  */
			ForthStack dubinNum = new ForthStack(3) {	//* Getting a dup result is done through the same Forth stack*/
				public void dup() {
					
				}
			};
			retX = dubinNum.dup(num1, num2);
			return retX;
		}
		
		public double doubleDupNum(double num1, double num2) {		//* Double DUP */
			ForthStack twoDupNum = new ForthStack(3) {		//* Double Dup method is the same as above in getting results from Forth stack */
				public void twoDup() {
					
				}
			};
			retX = twoDupNum.twoDup(num1, num2);
			return retX;
		}
		
		public double piNum(double num1, double numpi) {		//* Pi method */
			ForthStack piNum = new ForthStack(3) {	//* This method is used by the controller pi listener to get a value from variables */
				public void getPi() {
					
				}
			};
			retX = piNum.getPi(num1,numpi);
			return retX;
		}
		public double sqNum(double num1, double num2) {			//* x2 or square method */
			ForthStack sqNum = new ForthStack(3) {		//* Method also gives result from the Forth stack for execution of getSq() that pops result */
				public void getSq() {
					
				}
			};
			retX = sqNum.getSq(num1,num2);
			return retX;
		}
		public double factNum(double num) {						//* FACT method */
			ForthStack factoNum = new ForthStack(3) {	//* The method does not have to be used and can be eliminated because there it is just pushing and popping a value back */
				public void getFact() {				//* That value does not change when it comes back. */
					
				}
			};
			retX = factoNum.getFact(num);
			return retX;
		}
		
		
		public double getCalculatedValue() {			//*  Calculated Value returns result from methods above*/
			return retX;						//* All values calculated come back through this method from all proceeding methods */
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		RPN rpn = new RPN() {					//* The main method starts launching the RPN class and the other classes that are in it*/
			ViewCalc theView = new ViewCalc();	//* It establishes the controller to manage the view and model class while getting view under GUI to be visible. */
			CalModel theModel = new CalModel();
			CalController theController = new CalController(theView, theModel);
			{
				theView.setVisible(true);
			}
		};
	}

}

