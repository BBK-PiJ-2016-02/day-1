String[] validOperations = ['+', '-', '*', '/'];
String input = System.console().readLine(
	'Enter a string representation of a mathmatical operation (e.g. 2+2): '
);

String operation;
double result;
int operationInputIndex;

for(int i = 0; i < input.length(); i++) {
	String c = input.charAt(i);
	if(validOperations.contains(c)) {
		operation = c;
		operationInputIndex = i;
	}
}

double num1 = Double.parseDouble(input.substring(0, operationInputIndex));
double num2 = Double.parseDouble(input.substring(operationInputIndex+1, input.length()));

switch(operation) {
	case '+':
		result = num1 + num2;
		break
	case '-':
		result = num1 - num2;
		break
	case '*':
		result = num1 * num2;
		break
	case '/':
		result = num1 / num2;
		break
	default:
			throw new Exception('Invalid operation selected');
		break
}
println("Result of " + num1 + " " + operation + " " + num2 + " = " + result);
