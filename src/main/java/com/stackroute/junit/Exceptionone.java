package main.java.com.stackroute.junit;

//program to throw the exception and print the statement in the finally block
public class Exceptionone
{
    Exceptionone(String message) {
        message = "this is bound to execute";
        System.out.println(message);
    }
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception(); //throwing the exception
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("i will get printed"); //the finally block is printed for sure
        }

    }
}
