package strings;
//Write a Java program to reverse a given string with preserving the position of spaces?
public class Program_3 {
    public static void main(String args[]) 
    {  
    	reverseString("India is My   Country");
    }
	public static void reverseString(String string) 
	{
		char[] inputArray = string.toCharArray();
		char[] result = new char[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]==' ')
			{
				result[i] = ' ';
			}
		}
		
		int j =  result.length-1;
		for(int i =0 ; i<inputArray.length;i++)
		{
			if(inputArray[i]!=' ')
			{
				while(result[j]==' ')
				{
					j--;
				}
				result[j]=inputArray[i];
				j--;
			}
		}
		System.out.println(string + " --> " + String.valueOf(result)); 	
	} 
}
