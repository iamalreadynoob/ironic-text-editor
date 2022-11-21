package functionality;

public class RollerCoaster implements IFunctionality
{

	private String text;
	
	public RollerCoaster(String text)
	{
		this.text = text;
	}
	
	@Override
	public String process() {

		String editedText = "";
		int index = 0;
		
		for(int i = 0; i < text.length(); i++)
		{
			
			if(text.charAt(i) != ' ')
			{
				
				if(index % 2 == 0)
				{
					editedText += Character.toString(text.charAt(i)).toUpperCase();
					index++;
				}
				
				else
				{
					editedText += Character.toString(text.charAt(i)).toLowerCase();
					index++;
				}
				
			}
			else
			{
				if(!editedText.equals("")) editedText += Character.toString(text.charAt(i));
			}
			
		}
		
		
		return editedText;
	}

}
