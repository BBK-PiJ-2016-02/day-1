int power(int base, int exponent) {
	return Math.pow(base, exponent);
}

int power2(int exponent) {
	return power(2, exponent);
}

int binary2decimal(String binaryNum) {
	int decimalNum = 0;
	int len = binaryNum.length();
	for(int i = 0; i < len; i++) {
		decimalNum += Character.getNumericValue(binaryNum.charAt(i)) * power2(len - 1 - i);
	}
	return decimalNum;
}

String decimal2binary(int decimalNum) {
	String binaryNum = "";
	while(decimalNum > 0) {
		binaryNum = (decimalNum % 2) + binaryNum;
		decimalNum = Math.floor(decimalNum / 2);
	}
	if(binaryNum.length() == 0 ) {
		binaryNum = "0";
	}
	return binaryNum;
}

String userBinaryInput = System.console().readLine('Enter a binary number (e.g. 1011): ');
println("Binary number " + userBinaryInput + " as a decimal = " + binary2decimal(userBinaryInput));
println('');

int userDecimalInput = Integer.parseInt(System.console().readLine('Enter a decimal number (e.g. 47): '));
println("Decimal number " + userDecimalInput + " as binary = " + decimal2binary(userDecimalInput));
