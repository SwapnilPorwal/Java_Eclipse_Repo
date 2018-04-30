package FileHandlingInJava;

import java.io.File;

public class Program_007_ProgramToPrintFileDirectoryInFileName 
{
	public static void main(String[] args)
	{
		File folder = new File("C:\\Swapnil");
		String[] files = folder.list();
		for(String f : files)
		{
			System.out.println("File name is : "+f);
		}
	}
}
