package main.java.com.stackroute.junit;

//program to print the pattern of chessboard
public class ChessBoard
{
    public String[][] getChessBoard(int rows, int cols) {
        {
            String output[][] = new String[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW"; //printing ww in even positions
                    } else {
                        output[i][j] = "BB"; //printing bb in odd positions
                    }

                }


            }

            return output;
        }
    }

}
