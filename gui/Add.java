package gui;

import javax.swing.JFrame;

public class Add {
	
	protected Add(JFrame frame)
	{
		frame.add(Screen.plainText);
		frame.add(Screen.editedText);
		frame.add(Screen.ironiType);
		frame.add(Screen.convert);
		frame.add(Screen.copy);
	}

}
