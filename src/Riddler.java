import javax.swing.JOptionPane;

public class Riddler {
public static void main(String[] args) {
	int score = 0;
	String da1 = JOptionPane.showInputDialog(null, "Brothers and sisters I have none but this man's father is my father's son. Who is the man?");

if(da1.equalsIgnoreCase("your son")) {
	score++;
}
else
	JOptionPane.showMessageDialog(null, "Wrong, the anwser is  \"your son\"");
String da2 = JOptionPane.showInputDialog(null, "What is greater than God,\n" + 
		"more evil than the devil,\n" + 
		"the poor have it,\n" + 
		"the rich need it,\n" + 
		"and if you eat it, you'll die?");

if(da2.equalsIgnoreCase("nothing")) {
score++;
}
else
JOptionPane.showMessageDialog(null, "Wrong, the anwser is nothing");
JOptionPane.showMessageDialog(null, "Your score is " + score);
}
}
