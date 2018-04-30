package strings;
//How to remove a particular character from a string ?
public class Program_1 
{
	public static void main(String[] args) 
	{
		String str_1 = "I love my India !!!";
		System.out.println(charRemoveAt(str_1, 7)); 
	}
    public static String charRemoveAt(String str, int p) 
    {  
        return str.substring(0, p) + str.substring(p + 1);  
    }  
}
