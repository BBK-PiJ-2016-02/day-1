public class MatrixChecker {
	public boolean isSymmetrical(int[] intMatrix) {
		int len = intMatrix.length;

		for(int i = 0; i < len/2; i++) {
			if(intMatrix[i] != intMatrix[len - i - 1]) {
				return false;
			}
		}
		return true;
	}

	public boolean isSymmetrical(int[][] intMatrix) {
		int rowCount = intMatrix.length;
		int colCount = intMatrix[0].length;

		if(rowCount != colCount) {
			return false;
		}

		for(int y = 0; y < rowCount; y++) {
			for(int x = 0; x < colCount; x++) {
				if(intMatrix[x][y] != intMatrix[y][x]) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isTriangular(int[][] intMatrix) {
		return false;
	}
}