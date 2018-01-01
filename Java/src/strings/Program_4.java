package strings;
//Write a Java program to count the number of words in a string?
public class Program_4 {
    public static void main(String args[]) 
    {  
    	String str = " India  is     My country";
    	System.out.println("String : "+str);
    	str = str.trim();
    	String[] ch = str.split("\\s+");
    	int length = ch.length;
    	System.out.println("No of words : "+length);
    } 
}
