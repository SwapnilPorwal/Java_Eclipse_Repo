package strings;
//Write a Java program to count the Repetion of word in a string?
public class Program_5 {
    public static void main(String args[]) 
    {  
    	String str = "Selenium is a Automation tool . Selenium is the best . Yo Yo Selenium";
    	String str_temp = "#1#"+str+"#1#";
    	String[] ch = str_temp.split("Selenium");
    	int length = ch.length-1;
    	System.out.println("Word Count : "+length);
    } 
}
