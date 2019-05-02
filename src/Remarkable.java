import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	if(name.equals("Andrew")) {
		JOptionPane.showMessageDialog(null, "You know alot about sea anilmals");
	}
	if(name.equals("Colin")) {
		JOptionPane.showMessageDialog(null, "Your dog is the best dog ever on planet Earth");
	}
	else
	if(name.equals("Sofina")) {
		JOptionPane.showMessageDialog(null, "You exist");
	}
	else
	if(name.equals("Alisha")) {
		JOptionPane.showMessageDialog(null, "You have a brother");
	}
	else
	if(name.equals("Ameer")) {
		JOptionPane.showMessageDialog(null, "You have a sister");
	}
	else
		JOptionPane.showMessageDialog(null, "Error 404 ----- String \""+name+"\" was not found");
	}
	}
	
	


