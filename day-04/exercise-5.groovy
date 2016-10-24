class Point {
	double x = 0;
	double y = 0;

	double distanceTo(Point p) {
		return Math.sqrt(
			Math.pow((this.x - p.x), 2) +
			Math.pow((this.y - p.y), 2)
		);
	}

	double distanceToOrigin() {
		Point origin = new Point();
		return this.distanceTo(origin);
	}

	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	void moveTo(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	Point clone() {
		Point copy = new Point();
		copy.moveTo(this);
		return copy;
	}

	Point opposite() {
		Point copy = this.clone();
		copy.moveTo(copy.x * -1, copy.y * -1);
		return copy;
	}

	String toString() {
		return "[" + this.x + ", " + this.y + "]";
	}
}

// Tests
Point pointA = new Point();
pointA.moveTo(1, 1);

Point pointB = new Point();
pointB.moveTo(-2, -3);

Point pointC = new Point();
pointC.moveTo(3, 1);

Point pointD = new Point();
pointD.moveTo(2, -2);

Point pointE = new Point();
pointE.moveTo(2.5, 3);

Point pointACopy = pointA.clone();
Point pointF = pointA.opposite();

println(pointA.toString() + " -> " + pointB.toString() + " = " + pointA.distanceTo(pointB));
println(pointC.toString() + " -> " + pointE.toString() + " = " + pointC.distanceTo(pointE));
println(pointA.toString() + " -> " + pointACopy.toString() + " = " + pointA.distanceTo(pointACopy));
println(pointA.toString() + " -> " + pointF.toString() + " = " + pointA.distanceTo(pointF));