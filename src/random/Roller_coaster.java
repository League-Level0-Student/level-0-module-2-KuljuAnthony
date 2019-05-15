package random;

import javax.swing.JOptionPane;

public class Roller_coaster {
public static void main(String[] args) {
	
	String bob = JOptionPane.showInputDialog("how tall are you in inches");
 int o = Integer.parseInt(bob);
	if(o>(48)) {
		JOptionPane.showMessageDialog(null, "you can ride the Rollercoaster!");
		
	}
	if(o<=(48)) {
		JOptionPane.showMessageDialog(null, "what a shame shorty");
	}
	
	
}
}
