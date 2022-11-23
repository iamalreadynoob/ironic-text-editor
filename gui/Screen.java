package gui;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Screen extends JFrame
{
	
	protected static JTextArea plainText, editedText;
	protected static JComboBox ironiType, shitpostingList;
	protected static JButton convert, copy, addShitpost;
	
	public Screen()
	{
		this.setSize(700, 400);
		this.setLocation(0, 0);
		this.setTitle("Ironic Text Editor");
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		
		new CreateNew();
		new Add(this);
		new Positions();
		new Buttons();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
}
