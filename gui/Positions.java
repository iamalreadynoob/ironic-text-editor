package gui;

import java.awt.Color;

public class Positions {
	
	protected Positions()
	{
		Screen.plainText.setBounds(10, 10, 500, 100);
		Screen.plainText.setBackground(Color.GRAY);
		Screen.plainText.setForeground(Color.ORANGE);
		Screen.plainText.setBorder(null);
		Screen.plainText.setLineWrap(true);
		
		Screen.ironiType.addItem("");
		Screen.ironiType.addItem("Ego");
		Screen.ironiType.addItem("Ego Shout");
		Screen.ironiType.addItem("Keqo");
		Screen.ironiType.addItem("Roller Coaster");
		Screen.ironiType.addItem("Shout");
		
		Screen.ironiType.setBounds(530, 10, 150, 30);
		Screen.ironiType.setSelectedIndex(0);
		
		Screen.convert.setBounds(530, 70, 150, 30);
		Screen.convert.setBackground(Color.GREEN.darker());
		Screen.convert.setForeground(Color.BLACK);
		Screen.convert.setText("convert");
		
		Screen.editedText.setBounds(10, 200, 500, 100);
		Screen.editedText.setBackground(Color.GRAY);
		Screen.editedText.setForeground(Color.ORANGE);
		Screen.editedText.setBorder(null);
		Screen.editedText.setLineWrap(false);
		Screen.editedText.setEditable(false);
		
		Screen.copy.setBounds(530, 230, 150, 30);
		Screen.copy.setBackground(Color.GREEN.darker());
		Screen.copy.setForeground(Color.RED);
		Screen.copy.setText("copy");
		
		Screen.shitpostingList.addItem("");
		Screen.shitpostingList.addItem("31");
		Screen.shitpostingList.addItem("bane");
		Screen.shitpostingList.addItem("Konya");
		Screen.shitpostingList.addItem("napim");
		Screen.shitpostingList.addItem("sane");
		Screen.shitpostingList.addItem("sil knk");
		Screen.shitpostingList.addItem("sj");
		Screen.shitpostingList.addItem("Ohio");
		Screen.shitpostingList.addItem("xD");
		Screen.shitpostingList.addItem("za");
		
		Screen.shitpostingList.setBounds(10, 130, 100, 30);
		
		Screen.addShitpost.setBounds(140, 130, 100, 30);
		Screen.addShitpost.setBackground(Color.GREEN.darker());
		Screen.addShitpost.setForeground(Color.ORANGE.brighter());
		Screen.addShitpost.setText("add");
		
	}

}
