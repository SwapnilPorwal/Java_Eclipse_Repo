package javaPrograms;

import java.io.IOException;

public class Program_001_LaunchExternalApplicationsThroughJavaPrograms 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runtime runtime = Runtime.getRuntime();
		try
		{
			runtime.exec("notepad.exe");
			Process process = runtime.exec("notepad.exe C:\\Users\\sporwal\\Desktop\\Sample.txt");
			//Process process = runtime.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://javaconceptoftheday.com/");
			Thread.sleep(5000);
			process.destroy();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
