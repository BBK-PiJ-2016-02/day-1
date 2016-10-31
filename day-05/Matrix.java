public class Matrix {
	private int[] size = new int[2];
	private int[][] matrix;

	public Matrix(int x, int y) {

		this.size[0] = x;
		this.size[1] = y;

		this.matrix = new int[x][y];

		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				this.setElement(i, j, 0);
			}
		}
	}

	public void setElement(int x, int y, int value) {
		if(
			(this.size[0] > x && x > -1) &&
			(this.size[1] > y && y > -1)
		) {
			this.matrix[x][y] = value;
		}
	}

	public void setRow(int x, String values) {
		String[] rows = values.split(",");
		if(rows.length == this.size[1]) {
			for(int i = 0; i < this.size[1]; i++) {
				this.setElement(x, i, Integer.parseInt(rows[i]));
			}
		}
	}

	public void setColumn(int y, String values) {
		String[] cols = values.split(",");
		if(cols.length == this.size[0]) {
			for(int j = 0; j < this.size[0]; j++) {
				this.setElement(j, y, Integer.parseInt(cols[j]));
			}
		}
	}

	public void setMatrix(String values) {
		String[] rows = values.split(";");
		for(int j = 0; j < rows.length; j++) {
			this.setRow(j, rows[j]);
		}
	}

	public String toString() {
		String str = "[";

		for(int i = 0; i < this.size[0]; i++) {
			if(i != 0) {
				str += ";";
			}

			for(int j = 0; j < this.size[1]; j++) {
				if(j != 0) {
					str += ",";
				}
				str += this.matrix[i][j];
			}
		}

		str += "]";

		return str;
	}

	public void prettyPrint() {
		String str = "";

		for(int i = 0; i < this.size[0]; i++) {
			if(i != 0) {
				str += "\n";
			}

			for(int j = 0; j < this.size[1]; j++) {
				if(j != 0) {
					str += "\t";
				}
				str += this.matrix[i][j];
			}
		}

		str += "\n\n";

		System.out.print(str);
	}
}