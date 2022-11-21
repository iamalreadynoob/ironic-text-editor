package functionality;

public class EgoShout implements IFunctionality{
	
	private String text;
	
	public EgoShout(String text)
	{
		this.text = text;
	}
	
	@Override
	public String process()
	{
		String editedText = "";
		
		for(int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) != ' ')
			{
		
				if(editedText.equals(""))
				{
					editedText = Character.toString(text.charAt(i)).toUpperCase() + " ";
				}
				
				else if(i + 1 != text.length())
				{
					editedText = editedText + Character.toString(text.charAt(i)).toUpperCase() + " ";
				}
				
				else
				{
					editedText += Character.toString(text.charAt(i)).toUpperCase();
				}
				
			}
			
		}
		
		return editedText;
	}

}
