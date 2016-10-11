int max = -1;
int input = 0;

while(input != -1) {
	input = Integer.parseInt(
		System.console().readLine('Enter a positive number (enter -1 to end sequence): ')
	);
	if(input > max) {
		max = input;
	}
}

println('Highest number entered was: ' + max);