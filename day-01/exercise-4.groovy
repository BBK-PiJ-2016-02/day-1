int input = Integer.parseInt(System.console().readLine('Please enter a number: '));
int divideBy = (input / 2);
boolean isPrime = (input > 1);

while(divideBy > 1) {
	if((divideBy != 1) && (input % divideBy == 0)) {
		isPrime = false;
	}
	divideBy--;
}

if(isPrime) {
	println(input + ' is a prime number.');
} else {
	println(input + ' is not a prime number');
}
