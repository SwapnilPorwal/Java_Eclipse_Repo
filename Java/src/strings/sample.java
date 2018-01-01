package strings;

public class sample 
{
	public static void main(String[] args) 
	{
		String str_1 = "I love my India !!!";
		System.out.println(charRemoveAt(str_1, 2)); 
	}
    public static String charRemoveAt(String str, int p) 
    {  
        return str.substring(0, p) + str.substring(p + 1);  
    }  

}
