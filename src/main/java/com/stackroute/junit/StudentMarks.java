package main.java.com.stackroute.junit;

//program to check if the student marks are valid
public class StudentMarks {
    public String check(int stuGrades[], int numOfStudents) {
        for (int i = 0; i < numOfStudents; i++)

            if (stuGrades[i] < 0 || stuGrades[i] > 100) { //student marks should be between 1-100
                return "Error";
            }

        return "All marks are correct"; //return if the marks are valid

    }
}