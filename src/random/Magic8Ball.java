//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	
	int que = new Random().nextInt(4);
	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable
	System.out.println(que);

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("ask a question");
	// 5. If the random number is 0
if(que==0) {
	JOptionPane.showMessageDialog(null, "yes");
}
if(que==1) {
	JOptionPane.showMessageDialog(null, "no");
}
if(que==2) {
	JOptionPane.showMessageDialog(null, "???");
}
if(que==3) {
	JOptionPane.showMessageDialog(null, "no and you are a big turd");
}


	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}
