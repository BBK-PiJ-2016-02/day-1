int examMark
String s
print "Please key in your exam mark: "
s = System.console().readLine()
examMark = Integer.parseInt(s)

if (examMark >= 70) {
	println "An exceptional result!"
	println "We expect a first-class project from you."
} else if (examMark >= 50) {
	println "A satisfactory result"
	println "You may proceed with your project."
} else {
	println "I'm afraid you have failed."
	println "You may re-enter next year."
}