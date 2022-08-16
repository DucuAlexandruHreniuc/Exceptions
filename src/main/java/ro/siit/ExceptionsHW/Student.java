package ro.siit.ExceptionsHW;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    String dateOfBirth;
    String cnp;
    Gender gender;
    int age;

    public Student(String firstName, String lastName, String dateOfBirth, Gender gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cnp = cnp;
        age = ageCalc();
    }

    public int ageCalc() {
        this.dateOfBirth = String.valueOf(dateOfBirth);
        LocalDate dob = LocalDate.parse(dateOfBirth);
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob, curDate);
        return period.getYears();
    }
    @Override
    public int compareTo(Student otherStudent) {
        if (age > otherStudent.age) {
            return 1;
        }
        if (age < otherStudent.age) {
            return -1;
        }
//        if (cnp == otherStudent.cnp){
//                throw new RuntimeException("There can't be two persons with the same CNP");
//        }
        return lastName.compareTo(otherStudent.lastName);
    }
    @Override
    public String toString() {
        return "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nDate of birth: " + dateOfBirth + "\nGender: " + gender + "\nCNP: " + cnp + "\nAge: " + age;
    }
}
