
public class Converters {
	
	/******************************************************************************
	* Method Name: DecToHex                                                       *
	* Purpose: This function converts an input (given in the decimal base) to its * 
	* equivalent hex value 														  *
	* Returns: The hex value as a string                                          *
	******************************************************************************/
	
	String DecToHex(double value) {
		//To convert from a decimal value to a hex value, first convert the integer part,
		//and then the fractional part
		
		String[] letters = {"A", "B", "C", "D", "E", "F"};
		int integer = (int) value; //Get the integer part
		String numConverted = ""; //Holds the converted number
		
		while (integer != 0) { //While the integer part has not been converted yet 
			if (integer % 16 < 10) { //If the remainder is less than 10, do not worry about letters
				numConverted = (integer % 16) + numConverted; //Append the remainder value
			}
			else if ((integer % 16 <= 15) && (integer % 16 >= 10)) {
				numConverted = letters[(integer%16) - 10] + numConverted;
				//Append the appropriate letter to the conversion based on the remainder
			}
			integer = integer/16;
		}
		
		numConverted = numConverted + "."; //Add the hexadecimal point
		double fraction = value - ((int) value); //The stuff after the decimal point
		if (fraction == 0) { //If there is no fractional part
			numConverted = numConverted + "0"; //The converted fraction must be 0 then
		}
		
		while (fraction != 0) { //Keep multiplying until you only have 0's to the right of the hex point
			fraction = fraction * 16;
			int digitToAppend = (int) fraction; //Get what is to the left of the hex point
			if (digitToAppend < 10) { //Append the digit normally if letters are not needed
				numConverted = numConverted + digitToAppend;
			}
			else if ((digitToAppend <= 15) && (digitToAppend >= 10)) {
				numConverted = numConverted + letters[(digitToAppend) - 10];
			}
			fraction = fraction - ((int) fraction); //Drop the integer part of the product
		}
		
		return numConverted; //Now return the equivalent hex value as a string
	}
	
	/******************************************************************************
	* Method Name: DecToBin                                                       *
	* Purpose: This function converts an input (given in the decimal base) to its * 
	* equivalent binary value 													  *
	* Returns: The binary value as a string                                       *
	******************************************************************************/
	
	String DecToBin(double value) {
		//To convert from a decimal value to a binary value, first convert the integer part,
		//and then the fractional part
		
		int integer = (int) value; //Get the integer part
		String numConverted = ""; //Holds the converted value
		
		while (integer != 0) { //While the integer part has not been converted yet 
			numConverted = integer % 2 + numConverted; //Keep appending the remainder after
			//each quotient
			integer = integer/2;
		}
		
		numConverted = numConverted + "."; //Add the binary point
		double fraction = value - ((int) value); //The stuff after the decimal point
		if (fraction == 0) { //If there is no fractional part
			numConverted = numConverted + "0";
		}
		
		while (fraction != 0) {
			//Keep multiplying until you only have 0's to the right of the binary point
			fraction = fraction * 2;
			int digitToAppend = (int) fraction; //Get what is to the left of the binary point
			numConverted = numConverted + digitToAppend; //Append the integer part
			fraction = fraction - ((int) fraction); //Drop the integer part of the product
		}
		
		return numConverted; //Now return the equivalent binary value as a string
	}
	
	/******************************************************************************
	* Method Name: DecToOct                                                       *
	* Purpose: This function converts an input (given in the decimal base) to its * 
	* equivalent octal value 													  *
	* Returns: The octal value as a string                                        *
	******************************************************************************/
	
	String DecToOct(double value) {
		//To convert from a decimal value to a binary value, first convert the integer part,
		//and then the fractional part
		
		int integer = (int) value; //Get the integer part
		String numConverted = ""; //Holds the converted value
		
		while (integer != 0) { //While the integer part has not been converted yet 
			numConverted = integer % 2 + numConverted; //Keep appending the remainder after
			//each quotient
			integer = integer/2;
		}
		
		numConverted = numConverted + "."; //Add the binary point
		double fraction = value - ((int) value); //The stuff after the decimal point
		if (fraction == 0) { //If there is no fractional part
			numConverted = numConverted + "0";
		}
		
		while (fraction != 0) {
			//Keep multiplying until you only have 0's to the right of the binary point
			fraction = fraction * 2;
			int digitToAppend = (int) fraction; //Get what is to the left of the binary point
			numConverted = numConverted + digitToAppend; //Append the integer part
			fraction = fraction - ((int) fraction); //Drop the integer part of the product
		}
		
		return numConverted; //Now return the equivalent binary value as a string
	}
}
