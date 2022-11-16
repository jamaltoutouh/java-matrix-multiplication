public static int [][] createRandom2DMatrix(int rows, int cols){
    int matrix[][] = new int[rows][cols];
    Random random = new Random();

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = random.nextInt() % 10;
        }
    }
    return matrix;
}