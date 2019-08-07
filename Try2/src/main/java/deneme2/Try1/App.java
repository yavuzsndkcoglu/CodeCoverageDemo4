package deneme2.Try1;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public boolean isPalindrom(String input)
	{
		if(input==null)
		{
			throw new IllegalArgumentException("input sholdn'nt be null");
		}
		if(input.equals(reverse(input)))
		{
		return true;
		}
		else {
			return false;
		}
	}
	
	private String reverse(String input)
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--) 
		{
			rev=rev+input .charAt(i);
		}
		return rev;
	}
    
}
