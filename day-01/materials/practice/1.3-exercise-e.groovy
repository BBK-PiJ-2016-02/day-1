int time = Integer.parseInt(
	System.console().readLine("What is the time?: ")
)

if(time < 0 || time > 2359) {
	println "?"
} else if(time < 1200) {
	println "Good morning!"	
} else if(time < 1700) {
	println "Good afternoon!"	
} else if(time < 2100) {
	println "Good evening!"	
} else {
	println "Good night!"
}