def ranks = ['1','2','3','4','5','6','7','8','9','10','J','Q','K'];
def suits = ['spades', 'hearts', 'diamonds', 'clubs'];

def inputRanks = [];
def inputSuits = [];

while(inputRanks.size() < 5) {
	int cardNo = inputRanks.size() + 1;
	String rank = System.console().readLine('Enter rank [1-10JQK] for card #' + cardNo + ': ');
	String suit = System.console().readLine('Enter suit [' + suits.join(', ') + '] for card #' + cardNo + ': ');

	if(ranks.contains(rank) && suits.contains(suit)) {
		inputRanks.push(rank);
		inputSuits.push(suit);
	} else {
		println('ERROR: Invalid rank/suit, please try again');
	}
}

String bestHand = 'nothing';

if(bestHand == 'nothing') {
	// Straight flush
}

if(bestHand == 'nothing') {
	// Poker
}

if(bestHand == 'nothing') {
	// Full House
}

if(bestHand == 'nothing') {
	// Flush
}

if(bestHand == 'nothing') {
	// Straight
}

if(bestHand == 'nothing') {
	// Three of a kind
}

if(bestHand == 'nothing') {
	// Two pairs
}

if(bestHand == 'nothing') {
	// Pair
}

println('Your best hand is ' + bestHand);