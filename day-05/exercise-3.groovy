def String copyArray(int[] a, int[] b) {
	ArrayCopier copier = new ArrayCopier();
	print(a.toString() + " -> " + b.toString() + " = ");
	copier.copy(a, b);
	print(b.toString() + "\n");
}

copyArray((int[]) [2, 7], (int[]) [9, 9]);
copyArray((int[]) [2, 7], (int[]) [9, 9, 9]);
copyArray((int[]) [2, 7, 5], (int[]) [9, 9]);