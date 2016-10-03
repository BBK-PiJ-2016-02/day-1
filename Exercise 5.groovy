int number1 = Integer.parseInt(System.console().readLine("Number 1: "));
int number2 = Integer.parseInt(System.console().readLine("Number 2: "));
int result = 0;
int i1 = Math.abs(number1);
int i2 = Math.abs(number2);
while(i2 > 0) {
	result += i1;
	i2--;
}
if(number1 < 0) {
	result *= -1;
}
if(number2 < 0) {
	result *= -1;
}
print(number1 + " x " + number2 + " = " + result);