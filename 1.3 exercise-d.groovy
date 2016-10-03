int number1 = Integer.parseInt(System.console().readLine("Input number 1: "))
int number2 = Integer.parseInt(System.console().readLine("Input number 2: "))

if(number2 == 0) {
	println "Cannot divide by zero"
} else if(number1 % number2 == 0) {
	println "Yes"
} else {
	println "No"
}