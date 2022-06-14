package app.core;

public class ArrayMain {
    public static void main(String[] args) {
        String[] lines = new String[10];

        //? 3 x 3 matrix of float
        float[][] mat = new float[3][]; 

        float[][] mat2 = new float[3][3];

        for (int i = 0; i < mat.length; i++) {
            mat[i] = new float[3];
            mat[i][0] = i; //? First row, first column
            mat[i][1] = i; //? First row, second column
            mat[i][2] = i; //? First row, third column

        }

        float[][] mat3 = new float[3][];

        for (int i = 0; i < mat.length; i++) {
            mat[i] = new float[i + 1];
        }
    }
}
