package functionality;

public class Shout implements IFunctionality
{

	private String text;
	
	public Shout(String text)
	{
		this.text = text;
	}
	
	@Override
	public String process()
	{
		String editedText = "";
		
		for(int i = 0; i < text.length(); i++)
		{
			editedText += Character.toString(text.charAt(i)).toUpperCase();
		}
		
		return editedText;
	}
	
}
