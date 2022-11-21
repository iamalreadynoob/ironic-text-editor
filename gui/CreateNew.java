package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class CreateNew {
	
	protected CreateNew()
	{
		Screen.plainText = new JTextArea();
		Screen.editedText = new JTextArea();
		
		Screen.ironiType = new JComboBox();
		
		Screen.convert = new JButton();
		Screen.copy = new JButton();
	}

}
