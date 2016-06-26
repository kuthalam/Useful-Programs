
import javax.swing.JOptionPane;

public class BaseConverter {

	public static void main(String[] args) {
		Converters convert = new Converters();
		Object[] buttons = {"Decimal to Hex", "Decimal to Binary", "Decimal to Octal",
				"Hex to Decimal", "Binary to Decimal", "Octal to Decimal"
		};
		
		boolean again = true; //Whether the user would like to continue converting
		
		String number = JOptionPane.showInputDialog("Enter the number to convert: ");
		int conversion = JOptionPane.showOptionDialog(null, "How would you like to convert this number?",
				null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, null);
		
		double value = Double.parseDouble(number); //Convert the input to a double number
		
		switch(conversion) { //Now decide how to convert the input
			case 0: //Decimal to Hex conversion was selected
				System.out.println(convert.DecToHex(value));
				break;
			case 1: //Decimal to Binary conversion was selected
				System.out.println(convert.DecToBin(value));
				break;
			case 2: //Decimal to Octal conversion was selected
				System.out.println(number);
				//DecToOct(number);
				break;
			case 3: //Hex to Decimal conversion was selected
				System.out.println(number);
				//HexToDec(number);
				break;
			case 4: //Binary to Decimal conversion was selected
				System.out.println(number);
				//BinToDec(number);
				break;
			case 5: //Hex to Decimal conversion was selected
				System.out.println(number);
				//OctToDec(number);
				break;
			default: //No conversion has been selected
				break;
		}
	}

}
