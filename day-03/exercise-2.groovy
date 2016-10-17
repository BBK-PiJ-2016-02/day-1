double num1 = Double.parseDouble(
	System.console().readLine('Enter number 1: ')
);
double num2  = Double.parseDouble(
	System.console().readLine('Enter number 2: ')
);
String operation = System.console().readLine('Select operation [+-*/]');
double result;

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