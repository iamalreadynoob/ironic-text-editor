package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import functionality.Ego;
import functionality.EgoShout;
import functionality.Keqo;
import functionality.RollerCoaster;
import functionality.Shout;

public class Buttons {

	protected Buttons()
	{
		

		Screen.convert.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
		
				if(Screen.ironiType.getSelectedIndex() == 1)
				{
					Ego ego = new Ego(Screen.plainText.getText());
					Screen.editedText.setText(ego.process());
				}
				
				else if(Screen.ironiType.getSelectedIndex() == 2)
				{
					EgoShout egoShout = new EgoShout(Screen.plainText.getText());
					Screen.editedText.setText(egoShout.process());
				}
				
				else if(Screen.ironiType.getSelectedIndex() == 3)
				{
					Keqo keqo = new Keqo(Screen.plainText.getText());
					Screen.editedText.setText(keqo.process());
				}
				
				else if(Screen.ironiType.getSelectedIndex() == 4)
				{
					RollerCoaster rollerCoaster = new RollerCoaster(Screen.plainText.getText());
					Screen.editedText.setText(rollerCoaster.process());
				}
				
				else if(Screen.ironiType.getSelectedIndex() == 5)
				{
					Shout shout = new Shout(Screen.plainText.getText());
					Screen.editedText.setText(shout.process());
				}
				
			}
			
	});
		
		
		Screen.copy.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
		
				String copied = Screen.editedText.getText();
				StringSelection selection = new StringSelection(copied);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(selection, null);
				
				
				try
				{
					Screen.editedText.setText("copied!!!");
					Thread thread = new Thread();
					thread.sleep(2000);
					Screen.editedText.setText(copied);
					
				}catch(Exception we) {};
				
				
				
			}
			
	});
		
		
	}
	
	
}
