int randomNumber = Math.round(Math.random() * 1000);
int guessCount = 0;
int userGuess = -1;

println('Try to guess my number!');

while(userGuess != randomNumber) {
	userGuess = Integer.parseInt(System.console().readLine('Tell me a number: '));
	guessCount++;

	if(userGuess > randomNumber) {
		println('No! My number is lower.');
	} else if (userGuess < randomNumber) {
		println('No! My number is higher.');
	}
}

println('CORRECT!');
println('You needed ' + guessCount + ' guesses.');
