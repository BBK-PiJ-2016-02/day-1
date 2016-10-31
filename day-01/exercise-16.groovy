int playerOneScore = 0;
int playerTwoScore = 0;

while(playerOneScore < 3 && playerTwoScore < 3) {
	String input = System.console().readLine("Enter selection: ");
	char playerOneInput = input.substring(0, 1);
	char playerTwoInput = input.substring(1, 2);

	/*
		.. > P > R > S > P > ..

		Player 1 wins: PR, SP, RS
		Player 2 wins: PS, SR, RP
	*/

	if(playerOneInput != playerTwoInput) {
		switch(playerOneInput) {
			case "P":
				if(playerTwoInput == 'R') {
					playerOneScore++;
				} else {
					playerTwoScore++;
				}
				break;

			case "S":
				if(playerTwoInput == 'P') {
					playerOneScore++;
				} else {
					playerTwoScore++;
				}
				break;

			case "R":
				if(playerTwoInput == 'S') {
					playerOneScore++;
				} else {
					playerTwoScore++;
				}
				break;
		}
	}

	println("Player 1: " + playerOneScore + " | Player 2: " + playerTwoScore + " \n");
}

if(playerOneScore > playerTwoScore) {
	println("Player 1 wins!");
} else {
	println("Player 2 wins!");
}