class Point {
	double x;
	double y;
}

Point point1 = new Point();
point1.x = Double.parseDouble(System.console().readLine("point1.x: "));
point1.y = Double.parseDouble(System.console().readLine("point1.y: "));
println("");

Point point2 = new Point();
point2.x = Double.parseDouble(System.console().readLine("point2.x: "));
point2.y = Double.parseDouble(System.console().readLine("point2.y: "));
println("");

Point point3 = new Point();
point3.x = Double.parseDouble(System.console().readLine("point3.x: "));
point3.y = Double.parseDouble(System.console().readLine("point3.y: "));
println("");

double distancePoint1toPoint2 = Math.sqrt(
	Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2)
);

double distancePoint2toPoint3 = Math.sqrt(
	Math.pow((point2.x - point3.x), 2) + Math.pow((point2.y - point3.y), 2)
);

double distancePoint1toPoint3 = Math.sqrt(
	Math.pow((point1.x - point3.x), 2) + Math.pow((point1.y - point3.y), 2)
);

println("point1[x:"+point1.x+", y:"+point1.y+"]");
println("point2[x:"+point2.x+", y:"+point2.y+"]");
println("point3[x:"+point3.x+", y:"+point3.y+"]");
println("");
println("distancePoint1toPoint2: " + distancePoint1toPoint2);
println("distancePoint2toPoint3: " + distancePoint2toPoint3);
println("distancePoint1toPoint3: " + distancePoint1toPoint3);
println("");

if(distancePoint1toPoint2 < distancePoint2toPoint3) {
	if(distancePoint1toPoint2 < distancePoint1toPoint3) {
		println("point1 & point2 are closest");
	} else {
		println("point1 & point3 are closest");
	}
} else {
	if(distancePoint2toPoint3 < distancePoint1toPoint3) {
		println("point2 & point3 are closest");
	} else {
		println("point1 & point3 are closest");
	}
}