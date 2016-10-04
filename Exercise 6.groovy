int number1 = Integer.parseInt(System.console().readLine("Number 1: "));
int number2 = Integer.parseInt(System.console().readLine("Number 2: "));

int result = 0;
int remainder = -1;
int x = 0;

while(remainder < 0) {
	x = result * number2;
	if(x == number1) {
		remainder = 0;
	} else if(x > number1) {
		result--;
		remainder = number1 - (result * number2);
	} else {
		result++;
	}
}

println(
	number1 + " divide by " + number2 + " is " + result +
	", remainder " + remainder
);