public class MatrixMultiplication {

    static public String toString(int[][] C){
        if (C==null) {
            return "Error! See remote error.";
        }
        int rowsC = C.length;
        int colsC = C[0].length;
        String output = "";
        for(int i=0; i<rowsC; i++){
            for(int j=0; j<colsC; j++){
                output += C[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    static public boolean canBeMultiplied(int [][] A, int [][]B){
        int colsA = A[0].length;
        int rowsB = B.length;

        return colsA == rowsB;
    }

    static public int [][] multiply(int [][] A, int [][]B){
        if (canBeMultiplied(A, B) == false){
            return null;
        }

        //Get dimensions
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        int [][]C = new int [rowsA][colsB];

        for(int i=0; i<rowsA; i++){
            for(int j=0; j<colsB; j++){
                C[i][j]=0;
                for(int k=0; k<colsA; k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }//end of k loop
            }//end of j loop
        }
        return C;
    }

    public static void main(String[] args){
        int [][] A = {{-2,1}, {4,-3}, {8,2}}; //Initializes A
        int [][] B = {{-3,1,5}, {1,-2,0 }};    //Initializes B

        System.out.println("A: ");
        System.out.println(toString(A));
        System.out.println("B: ");
        System.out.println(toString(B));

        int [][] C = multiply(A, B);
        System.out.println("A*B: ");
        System.out.println(toString(C));
    }




}
