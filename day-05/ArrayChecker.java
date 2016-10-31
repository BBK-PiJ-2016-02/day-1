public class ArrayChecker {
	public boolean isSymmetrical(int[] intArray) {
		int len = intArray.length;

		for(int i = 0; i < len/2; i++) {
			if(intArray[i] != intArray[len - i - 1]) {
				return false;
			}
		}
		return true;
	}

	public int[] reverse(int[] intArray) {
		int len = intArray.length;

		for(int i = 0; i < len/2; i++) {
			int buffer = intArray[i];
			int endIndex = len - i - 1;

			intArray[i] = intArray[endIndex];
			intArray[endIndex] = buffer;
		}

		return intArray;
	}
}