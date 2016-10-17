class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle rectangle1 = new Rectangle();
Rectangle rectangle2 = new Rectangle();
Point upLeft1 = new Point();
Point upLeft2 = new Point();
Point downRight1 = new Point();
Point downRight2 = new Point();

rectangle1.upLeft = upLeft1;
rectangle2.upLeft = upLeft2;
rectangle1.downRight = downRight1;
rectangle2.downRight = downRight2;

Point thirdPoint = new Point();

rectangle1.upLeft.x = Double.parseDouble(System.console().readLine("rectangle1.upLeft.x: "));
rectangle1.upLeft.y = Double.parseDouble(System.console().readLine("rectangle1.upLeft.y: "));
println("")
rectangle1.downRight.x = Double.parseDouble(System.console().readLine("rectangle1.downRight.x: "));
rectangle1.downRight.y = Double.parseDouble(System.console().readLine("rectangle1.downRight.y: "));
println("")
rectangle2.upLeft.x = Double.parseDouble(System.console().readLine("rectangle2.upLeft.x: "));
rectangle2.upLeft.y = Double.parseDouble(System.console().readLine("rectangle2.upLeft.y: "));
println("")
rectangle2.downRight.x = Double.parseDouble(System.console().readLine("rectangle2.downRight.x: "));
rectangle2.downRight.y = Double.parseDouble(System.console().readLine("rectangle2.downRight.y: "));
println("")
thirdPoint.x = Double.parseDouble(System.console().readLine("thirdPoint.x: "));
thirdPoint.y = Double.parseDouble(System.console().readLine("thirdPoint.y: "));
println("")

boolean xInside1 = (
	thirdPoint.x >= rectangle1.upLeft.x &&
	rectangle1.downRight.x >= thirdPoint.x
);

boolean yInside1 = (
	thirdPoint.y <= rectangle1.upLeft.y &&
	rectangle1.downRight.y <= thirdPoint.y
);

boolean xInside2 = (
	thirdPoint.x >= rectangle2.upLeft.x &&
	rectangle2.downRight.x >= thirdPoint.x
);

boolean yInside2 = (
	thirdPoint.y <= rectangle2.upLeft.y &&
	rectangle2.downRight.y <= thirdPoint.y
);

boolean inside1 = xInside1 && yInside1;
boolean inside2 = xInside2 && yInside2;

println("xInside1: " + xInside1);
println("yInside1: " + yInside1);
println("xInside2: " + xInside2);
println("yInside2: " + yInside2);
println("");

println("inside1: " + inside1);
println("inside2: " + inside2);
println("");

print("thirdPoint [" + thirdPoint.x + ", " + thirdPoint.y + "] ");

if(inside1 && inside2) {
	print("is inside both of");
} else if(inside1 || inside2) {
	print("is inside one of");
} else {
	print("is outside both of");
}

print(
	" the rectangles ["+
		"["+
			"["+rectangle1.upLeft.x+","+rectangle1.upLeft.y+"]"+
			"["+rectangle1.downRight.x+","+rectangle1.downRight.y+"]"+
		"]["+
			"["+rectangle2.upLeft.x+","+rectangle2.upLeft.y+"]"+
			"["+rectangle2.downRight.x+","+rectangle2.downRight.y+"]"+
		"]"+
	"]\n"
)