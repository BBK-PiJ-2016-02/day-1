def numbers = [];
for(int i = 1; i <= 3; i++) {
	numbers.push(Integer.parseInt(System.console().readLine("Number " + i + ": ")));
}
print(numbers.sort().join(', '));