package random;

import javax.swing.JOptionPane;

public class voting_booth {
public static void main(String[] args) {
	
	
	String bob = JOptionPane.showInputDialog("how old are you?");
 int o = Integer.parseInt(bob);
	if(o>=(18)) {
		JOptionPane.showInputDialog("who do you think the president should be?");
		
	}
	if(o<(18)) {
		JOptionPane.showMessageDialog(null, "nobody cares what you think");
	}
	
	
	
	
}
}
