Matrix matrix = new Matrix((int) 3, (int) 3);

matrix.setMatrix('1,2;3,4;5,6');
matrix.prettyPrint();
matrix.setMatrix('1,2,3;4,5,6;7,8,9');
matrix.prettyPrint();
matrix.setMatrix('1,2,3,9,9,9;4,5,6,9,9,9;7,8,9,9,9,9');
matrix.prettyPrint();