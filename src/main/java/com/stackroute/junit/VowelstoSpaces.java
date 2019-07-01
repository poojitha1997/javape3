package main.java.com.stackroute.junit;

public class VowelstoSpaces {
    public String[] removeVowels(String inputString[]) {
        for (int i = 0; i < inputString.length; i++)
            inputString[i] = inputString[i].replaceAll("[aeiouAEIOU]", "");
        return inputString;

    }
}