package main.java.com.stackroute.junit;

//program for checking if the numbers in array are consecutive
public class ConsecutiveTest
{
    boolean result = false;
    public boolean checkForConsectiveNumbers(String values)
    {
        //spliting the string into an array
        String[] array = values.split(",");
        for (int i = 0; i < array.length - 1; i++) {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            System.out.println(difference);
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

}
