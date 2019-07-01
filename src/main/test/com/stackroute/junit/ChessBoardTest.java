package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.ChessBoard;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest
{
    ChessBoard object;
    @Before
    public void setUp() throws Exception {
        object=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void check() {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = object.getChessBoard(8,8);

        assertNotEquals("Following is chessPattern output",expected,actual);
    }


}