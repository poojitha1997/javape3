package main.java.com.stackroute.junit;

//program to convert the vowels to the spaces
public class VowelstoSpaces {
    public String[] removeVowels(String inputString[]) {
        for (int i = 0; i < inputString.length; i++)
            inputString[i] = inputString[i].replaceAll("[aeiouAEIOU]", ""); //removing the vowels from the string
        return inputString;

    }
}