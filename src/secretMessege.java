import javax.swing.JOptionPane;

public class secretMessege {
public static void main(String[] args) {
	String password = "ColinsCool";
	String secret = JOptionPane.showInputDialog(null, "What is your secret?");
	String guess = JOptionPane.showInputDialog(null, "Guess DA CODE");
	if(guess.equals(password)) {
		JOptionPane.showMessageDialog(null, "The secret is...");
		JOptionPane.showMessageDialog(null, secret);	
	}
	else
		JOptionPane.showMessageDialog(null, "INTRUDER!");
	}
			
}

