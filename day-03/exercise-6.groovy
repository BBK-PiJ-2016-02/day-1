class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle rectangle = new Rectangle();
Point upLeft = new Point();
Point downRight = new Point();

rectangle.upLeft = upLeft;
rectangle.downRight = downRight;

Point thirdPoint = new Point();

rectangle.upLeft.x = Double.parseDouble(System.console().readLine("rectangle.upLeft.x: "));
rectangle.upLeft.y = Double.parseDouble(System.console().readLine("rectangle.upLeft.y: "));
println("")
rectangle.downRight.x = Double.parseDouble(System.console().readLine("rectangle.downRight.x: "));
rectangle.downRight.y = Double.parseDouble(System.console().readLine("rectangle.downRight.y: "));
println("")
thirdPoint.x = Double.parseDouble(System.console().readLine("thirdPoint.x: "));
thirdPoint.y = Double.parseDouble(System.console().readLine("thirdPoint.y: "));
println("")

boolean xInside = (
	thirdPoint.x >= rectangle.upLeft.x &&
	rectangle.downRight.x >= thirdPoint.x
);

boolean yInside = (
	thirdPoint.y <= rectangle.upLeft.y &&
	rectangle.downRight.y <= thirdPoint.y
);

println("xInside: " + xInside);
println("yInside: " + yInside);
println("");

print("thirdPoint [" + thirdPoint.x + ", " + thirdPoint.y + "] ");
if(xInside && yInside) {
	print("is inside");
} else {
	print("is outside");
}
print(
	" the rectangle ["+
		"["+rectangle.upLeft.x+","+rectangle.upLeft.y+"]"+
		"["+rectangle.downRight.x+","+rectangle.downRight.y+"]"+
	"]\n"
)