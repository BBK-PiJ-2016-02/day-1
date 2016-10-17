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

rectangle.upLeft.x = Double.parseDouble(System.console().readLine("rectangle.upLeft.x: "));
rectangle.upLeft.y = Double.parseDouble(System.console().readLine("rectangle.upLeft.y: "));
println("")
rectangle.downRight.x = Double.parseDouble(System.console().readLine("rectangle.downRight.x: "));
rectangle.downRight.y = Double.parseDouble(System.console().readLine("rectangle.downRight.y: "));
println("")

double rectangleWidth = Math.abs(rectangle.downRight.x - rectangle.upLeft.x);
double rectangleHeight = Math.abs(rectangle.upLeft.y - rectangle.downRight.y);

double perimeter = (rectangleWidth + rectangleHeight) * 2;
double area = rectangleWidth * rectangleHeight;

println("Width of rectangle = " + rectangleWidth);
println("Height of rectangle = " + rectangleHeight);
println("")

println("Perimeter of rectangle = " + perimeter);
println("Area of rectangle = " + area);