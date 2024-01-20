public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	RegularPolygon() {
		n = 3;
		side = 1;
		x = y = 0;
	}

	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
		x = y = 0;
	}

	RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}

	public void setN(int newN) {
		n = newN;
	}

	public void setSide(double newSide) {
		side = newSide;
	}

	public void setX(double newX) {
		x = newX;
	}

	public void setY(double newY) {
		y = newY;
	}

	public int getN() {
		return n;
	}

	public double getSide() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getPerimeter() {
		return side * n;
	}

	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}

    public static void main(String[] args) {
		// Create three RegularPolygon objects
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		// Display perimeter and area of each object
		System.out.println("\n--------------------------------------------------");
		System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
		System.out.println("--------------------------------------------------");
		System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n", 
			regularPolygon1.getPerimeter(), regularPolygon1.getArea());
		System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n", 
			regularPolygon2.getPerimeter(), regularPolygon2.getArea());
		System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n", 
			regularPolygon3.getPerimeter(), regularPolygon3.getArea());
		System.out.println("--------------------------------------------------");
	}
}