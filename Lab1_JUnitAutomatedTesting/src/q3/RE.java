package q3;
import java.util.*;

public class RE {
	
	public static boolean checkPhoneNumber(String s) {
		return s.matches("^\\s*[(]*(\\d{3})[) ][ ]*(\\d{3})[- ]*[-]*[ ]*(\\d{4})$");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a phone number:");
		String inp = in.nextLine();
		boolean wasPhoneNumber = checkPhoneNumber(inp);
		System.out.println("\nThat was" + (wasPhoneNumber? "" : "n't") + " a phone number");
	}

}