package ifs_ints_and_loops;

import javax.swing.JOptionPane;

class My_Ages {
public static void main(String[] args) {
	int age = 0;
	for(int i = 0; i<13; i++) {
		JOptionPane.showMessageDialog(null, "I am "+age +" years old!");
		age++;
	}	
}
}
