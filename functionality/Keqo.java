package functionality;

public class Keqo implements IFunctionality{
	
	private String text;
	
	public Keqo(String text)
	{
		this.text = text;
	}

	@Override
	public String process() {

		String editedText = "";
		
		for(int i = 0; i < text.length(); i++)
		{
			
			if(text.charAt(i) == 'e' || text.charAt(i) == 'E')
			{
				
				if(editedText.equals("")) editedText = "3";
				else editedText += "3";
			}
			
			else if(text.charAt(i) == 'v' || text.charAt(i) == 'V')
			{
				if(editedText.equals("")) editedText = "w";
				else editedText += "w";
			}
			
			else if(text.charAt(i) == 'k' || text.charAt(i) == 'K')
			{
				if(editedText.equals("")) editedText = "q";
				else editedText += "q";
			}
			
			else
			{
				
				if(editedText.equals("")) editedText = Character.toString(text.charAt(i));
				else editedText += Character.toString(text.charAt(i));
			}
			
		}
		
		return editedText;
	}
	
	

}
