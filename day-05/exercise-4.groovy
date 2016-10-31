Matrix matrix = new Matrix((int) 2, (int) 4);

matrix.setElement(1, 2, 1337);
matrix.setElement(6, 2, 8888);
matrix.prettyPrint();
matrix.setRow(0, '42,42,42,42');
matrix.prettyPrint();
matrix.setColumn(1, '69,69');
matrix.setColumn(1, '22,22,22');
matrix.prettyPrint();
println(matrix.toString());