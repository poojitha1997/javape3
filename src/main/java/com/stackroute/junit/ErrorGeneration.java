package main.java.com.stackroute.junit;

//program to generate the error by the try and catch block
public class ErrorGeneration
{

    public static void main(String[] args) {
        try {
            throw new NegativeArraySizeException(); //try block is throwing the NegativeArraySizeException exception
        } catch (NegativeArraySizeException e1) {
            System.out.println(e1.toString()); //catch block is catching the NegativeArraySizeException exception
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e2) {
            System.out.println(e2.toString());
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e3) {
            System.out.println(e3.toString());
        }
    }
}
