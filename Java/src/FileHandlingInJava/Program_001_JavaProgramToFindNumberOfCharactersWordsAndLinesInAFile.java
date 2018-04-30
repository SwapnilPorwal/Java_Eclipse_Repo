package FileHandlingInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program_001_JavaProgramToFindNumberOfCharactersWordsAndLinesInAFile
{
	public static void main(String[] args)
	{
		BufferedReader reader = null;
		//Initializing CharCount , WordCount and LineCount to 0
		int CharCount=0;
		int WordCount=0;
		int LineCount=0;
		try
		{
			//Creating Buffered reader object
			reader = new BufferedReader(new FileReader("C:\\Swapnil\\Sample.txt"));
			// Read first line into current Line
			String currentLine = reader.readLine();
			while(currentLine!=null)
			{
				//Updating Line Count
				LineCount++;
				//Getting no of words in currentLine
				String[] words = currentLine.split(" ");
				//Updating word count
				WordCount = WordCount + words.length;
				//Iterating each word
				for(String word:words)
				{
					CharCount = CharCount+word.length();
				}
				currentLine = reader.readLine();
			}
			//Printing charCount, wordCount and lineCount
            System.out.println("Number Of Chars In A File : "+CharCount);
            System.out.println("Number Of Words In A File : "+WordCount);
            System.out.println("Number Of Lines In A File : "+LineCount);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
	}
}
