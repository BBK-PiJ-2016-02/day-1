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

for(int i = 0; i < 1000; i++) {
	if(isPrimeNum(i)) {
		println(i);
	}
}
