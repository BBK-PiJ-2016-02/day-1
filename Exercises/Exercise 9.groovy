int lastNum = -1;
int input = 0;
boolean ascending = true;

while(input != -1) {
	if(input != lastNum+1) {
		ascending = false;
	}
	lastNum = input;
	input = Integer.parseInt(
		System.console().readLine('Enter a positive number (enter -1 to end sequence): ')
	);
}

if(ascending) {
	println('Yes');
} else {
	println('No');
}