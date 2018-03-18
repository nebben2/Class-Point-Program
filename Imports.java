import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Imports {

	public static boolean isNumeric(String str)  {
		
	  try  {  
		  
	    @SuppressWarnings("unused")
		double Catch = Double.parseDouble(str);  
	    
	  }  
	  
	  catch(NumberFormatException nfe)  {  
		  
	    return false;  
	    
	  }  
	  
	  return true;  
	  
	}
	
	 public static Properties readProperties(String fileName) {
		 
		Properties propertiesRead = new Properties();		
		try {
			
			propertiesRead.load(new FileReader(fileName));
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return propertiesRead;
		
	}

	 public static void	writeProperties(String dataName, String fileName, String dataStored) {
		
		
		Properties propertiesWrite = new Properties();
		propertiesWrite.setProperty(dataName, dataStored);
		try {
			
			propertiesWrite.store(new FileWriter(fileName),"(Null)");
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		
		}
	
	}
	
}