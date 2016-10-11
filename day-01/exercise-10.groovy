int lastNum = -1;
int input = 0;
boolean consecutive = true;

while(input != -1) {
	if(lastNum > 0 && input != lastNum+1 && input != lastNum-1) {
		consecutive = false;
	}
	lastNum = input;
	input = Integer.parseInt(
		System.console().readLine('Enter a positive number (enter -1 to end sequence): ')
	);
}

if(consecutive) {
	println('Yes');
} else {
	println('No');
}