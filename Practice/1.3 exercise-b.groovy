int husbandSalary = Integer.parseInt(
	System.console().readLine("Input the salary of husband: ")
)

int wifeSalary = Integer.parseInt(
	System.console().readLine("Input the salary of the wife: ")
)

if((husbandSalary + wifeSalary) > 40000) {
	println "Your combined income makes you due for tax at the higher rate"
} else {
	println "Your combined income does not make you due for tax at the higher rate"
}