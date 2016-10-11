def isPrimeNum(input) {
	int divideBy = (input/2);
	boolean isPrime = (input > 1);
	
	while(divideBy > 1) {	
		if((divideBy != 1) && (input % divideBy == 0)) {
			isPrime = false;
		}

		divideBy--;
	}

	return isPrime;
}

int primeCount = 0;
int i = 0;
while(primeCount < 1000) {
	i++;
	if(isPrimeNum(i)) {
		primeCount++;
		println(i);
	}
}
