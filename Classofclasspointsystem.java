import java.util.Properties;
import javax.swing.JOptionPane;

public class Classofclasspointsystem {		

	public static void main(String[] args) {

		Properties output = Imports.readProperties("DStore.properties");
		String ParsedOutput = output.getProperty("currentPoints");
		Properties positiveFive = Imports.readProperties("FiveOutput.properties");
		Properties positiveTwenty = Imports.readProperties("TwentyOutput.properties");
		Properties positiveFifty = Imports.readProperties("FiftyOutput.properties");
		Properties positiveOneHundred = Imports.readProperties("OneHundredOutput.properties");
		Properties negativeFive = Imports.readProperties("NegativeFiveOutput.properties");
		Properties negativeTwenty = Imports.readProperties("NegativeTwentyOutput.properties");
		Properties negativeFifty = Imports.readProperties("NegativeFiftyOutput.properties");
		Properties negativeOneHundred = Imports.readProperties("NegativeOneHundredOutput.properties");
		if(Imports.isNumeric(ParsedOutput)); {
	
			int ParsedFinal = Integer.parseInt(ParsedOutput);
			int classRatingStarterPoint = ParsedFinal; //Used as a starter point
			int classRating = classRatingStarterPoint; //Variable throughout
			System.out.println("Debug: Variable preparatory initialisation complete");
			String input = JOptionPane.showInputDialog(null, "How much do you want to change the class rating by, the current rating is " + classRatingStarterPoint);
			if(Imports.isNumeric(input)) {  //To prevent NFE exceptions
				
				int alteration = Integer.parseInt(input);
				alteration = alteration + classRating;
				String write = "" + alteration; //Because parsing is annoying
				Imports.writeProperties("currentPoints", "DStore.properties", write);
				if(alteration >= 5 && alteration < 20) {
					
					JOptionPane.showMessageDialog(null, positiveFive);					
					
				}
                if(alteration >= 20 && alteration < 50) {
					
					JOptionPane.showMessageDialog(null, positiveTwenty);					
					
				}
                else if(alteration >= 50 && alteration < 100) {
					
					JOptionPane.showMessageDialog(null, positiveFifty);					
					
				}
                else if(alteration >= 100) {
					
					JOptionPane.showMessageDialog(null, positiveOneHundred);					
					
				}
                if(alteration <= -5 && alteration > -20) {
					
					JOptionPane.showMessageDialog(null, negativeFive);					
					
				}
                else if(alteration <= -20 && alteration > -50) {
					
					JOptionPane.showMessageDialog(null, negativeTwenty);					
					
				}
                else if(alteration <= -50 && alteration > -100) {
					
					JOptionPane.showMessageDialog(null, negativeFifty);					
					
				}
                else if(alteration <= -100) {
					
					JOptionPane.showMessageDialog(null, negativeOneHundred);	
					
				}
        		
				JOptionPane.showMessageDialog(null, "The current rating is " + write);
				System.out.println("Debug: All checks done, if one is missing or has a mistake please report");
				
			}
			else {
				
				System.out.println("Error: Input is not numeric");
				
			}
			
		}
		
	}
		
}