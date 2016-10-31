def boolean checkMatrix(int[] matrix) {
	MatrixChecker checker = new MatrixChecker();
	println(matrix.toString());
	println("isSymmetrical: " + checker.isSymmetrical(matrix));
	println();
}

def boolean checkMatrix(int[][] matrix) {
	MatrixChecker checker = new MatrixChecker();
	println("[");
	for(int i = 0; i < matrix.length; i++) {
		println("\t" + matrix[i].toString() + ",");
	}
	println("]");
	println("isSymmetrical: " + checker.isSymmetrical(matrix));
	println("isTriangular: " + checker.isTriangular(matrix));
	println();
}

checkMatrix((int[]) [1,2,3,2,1]);
checkMatrix((int[]) [1,7,7,3,2,1]);

checkMatrix((int[][]) [
	(int[]) [1,2,3],
	(int[]) [2,2,3],
	(int[]) [3,3,3]
]);

checkMatrix((int[][]) [
	(int[]) [9,2,3],
	(int[]) [9,2,3],
	(int[]) [9,3,3]
]);