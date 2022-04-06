import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Stack;

public class StackPalindrome {
	//Stack housing character objects
	public static boolean firstStep(String initialPalindrome)
	{//Loop pushing each letter in the word to check onto the stack with the first letter
		Stack <Character> firstStack = new Stack<>();
		for (int num=0; num<initialPalindrome.length(); num++)
		{
			firstStack.push(initialPalindrome.charAt(num));
		}
		//Declaring string builder that houses each letter off the stack
		
		StringBuilder letterHouse = new StringBuilder();
		//Second loop for each letter in the stack that also appends it to the string builder
		while(!firstStack.isEmpty())
		{
			letterHouse.append(firstStack.pop());
		}
		//Comparison between string builder and the word
		if (letterHouse.toString().equals(initialPalindrome))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
public static void main(String[]args) throws IOException
{
	String properties = args [0];
	FileReader propertiesReader = new FileReader(properties);
	Properties propertiesMain = new Properties();
	propertiesMain.load(propertiesReader);
	FileWriter propertiesWriter = new FileWriter(new File( propertiesMain.get("log_file_name").toString()));
	String order = propertiesMain.getProperty("words");
	String [] fileWords = order.split(",");
	String result = "";
	for ( int num = 0; num<fileWords.length; num++)
	{
		if(firstStep(fileWords[num]))
		{
			result=result+fileWords[num]+ "Palindrome found";
		}
		else
					{
			result=result+fileWords[num]+"Palindrome not found";
				
					}
		}
	propertiesWriter.write(result);
	propertiesWriter.close();
}
}

	



