package q3;

public class Triclass {

	public static String classify (int x, int y, int z) {
		
		boolean rule1 = x + y > z;
		boolean rule2 = y + z > x;
		boolean rule3 = z + x > y;
		if (rule1 == false || rule2 == false || rule3 == false) {
			return "Invalid";
		}
		if (x == y && y == z) {
			return "Equilateral";
		} else if ((x == y && y != z && x != z) || (y == z && z != x && x != y) || (z == x && x != y && y != z)){
			return "Isosceles";
		} else if (x != y && y != z && x != z) {
			return "Scalene";
		} else {
			return "Invalid";
		}
	}
}
