int count = Integer.parseInt(
	System.console().readLine('How many lines high should the pyramid be (max 9)? ')
);

count = Math.min(9, Math.max(0, count));

for(int i = 1; i <= count; i++) {
	for(int j = 0; j < i; j++) {
		print i;
	}
	print "\n";
}

