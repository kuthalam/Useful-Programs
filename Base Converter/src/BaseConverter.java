
import javax.swing.JOptionPane;

public class BaseConverter {

	public static void main(String[] args) {
		/* Local variables, data structures, objects, etc. */
		Object[] buttons = {"Decimal to Hex", "Decimal to Binary", "Decimal to Octal",
				"Hex to Decimal", "Binary to Decimal", "Octal to Decimal"
		};
		int again = 0; //Whether the user would like to continue converting/Initialized to "yes"
		double finalAnswer = 0; //The final answer returned after conversion
		
		/*Initiate converter here */
		while (again == 0) {
			/* Get user input */
			String number = JOptionPane.showInputDialog("Enter the number to convert: ");
			int conversion = JOptionPane.showOptionDialog(null, "How would you like to convert this number?",
					null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, null);
			
			/* Determine which conversion was selected (to figure out whether to convert from string or double) */
			if (conversion < 3) {
				double value = Double.parseDouble(number); //Convert the input to a double number
				finalAnswer = convert(conversion, value, null);
			}
			else {
				finalAnswer = convert(conversion, 0, number);
				//In the case one wants to convert from hex to decimal, convert directly from the string
			}
			
			/* Display the final answer */
			JOptionPane.showMessageDialog(null, "You asked for " + number + " to be converted from "
					+ buttons[conversion] + ". The converted value is " + finalAnswer + ".");
			
			/* Go again? */
			again = JOptionPane.showOptionDialog(null, "Would you like to convert another number?",
					"Re-run?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		}
	}
	
	protected static double convert(int convertType, double numToConvert, String hexToConvert) {
		/* Local variables, data structures, objects, etc. */
		Converters convert = new Converters();
		
		/* Convert based on the user's selection */
		switch(convertType) { //Now decide how to convert the input
		case 0: //Decimal to Hex conversion was selected
			return Double.parseDouble(convert.DecToHex(numToConvert));
			
		case 1: //Decimal to Binary conversion was selected
			return Double.parseDouble(convert.DecToBin(numToConvert));
			
		case 2: //Decimal to Octal conversion was selected
			return Double.parseDouble(convert.DecToOct(numToConvert));
			
		case 3: //Hex to Decimal conversion was selected
			return convert.HexToDec(hexToConvert);
			
		case 4: //Binary to Decimal conversion was selected
			return convert.BinToDec(hexToConvert);
			
		case 5: //Octal to Decimal conversion was selected
			return convert.OctToDec(hexToConvert);
			
		default: //No conversion has been selected
			break;
		}
		
		return -1; //Error code is returned
	}
}
