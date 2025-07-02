package q1;

public class ArrayMult {

	public int[] mult (int[] array1, int[] array2) {
		int minlen = Math.min(array1.length, array2.length);
		int[] longArray;
		if (array1.length >= array2.length) {
			longArray = array1;
		} else {
			longArray = array2;
		}
		int[] outArray = new int[longArray.length];
		for (int i = 0; i < minlen; i ++) {
			outArray[i] = array1[i] * array2[i];
		}
		for (int j = minlen; j < longArray.length; j ++) {
			outArray[j] = longArray[j];
		}
		return outArray;
	}
}