package q2;

public class Triangle {
	public int side1, side2, side3;
	public Triangle (int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calculateArea () throws Exception {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			throw new Exception("side length less than 0");
		}
		double s = (side1 + side2 + side3) * 0.5;
		System.out.println("\t s=" + s);
		double result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("\t result = " + result);
		return result;
	}

}