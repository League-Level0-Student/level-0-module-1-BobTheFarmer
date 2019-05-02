import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String input = JOptionPane.showInputDialog("When is your birthday? Type it like this mm/dd.");
	if (input.equals("05/01")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday, " + name + "!");
	}
		else
			JOptionPane.showMessageDialog(null, "Happy Un-Birthday, " + name + "!");
	
	}
}

