package main.java.com.stackroute.junit;

//program to calculate the sum of matrices
public class MatricesSum {

    public int[][] checkSum(int rows, int colums, int a1[][], int a2[][]) {
        int sum[][] = new int[rows][colums];
        for (int i = 0; i < rows; i++) { //adding the elements in one matrix to the another matrix
            for (int j = 0; j < colums; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return sum;

    }
}

