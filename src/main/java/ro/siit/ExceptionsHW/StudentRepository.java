package ro.siit.ExceptionsHW;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentRepository {
    public Set<Student> studentList = new TreeSet<>();
    public void addStudent(Student student) {
        studentList.add(student);
        if (student.age < 18) {
            studentList.remove(student);
            try {
                throw new RuntimeException("\nCannot add student!\nStudent " + student.firstName + " " + student.lastName + " is under 18 years old.");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if (student.firstName.isEmpty() || student.lastName.isEmpty() || student.cnp.isEmpty() || student.dateOfBirth.isEmpty()) {
            studentList.remove(student);
            try {
                throw new RuntimeException("\nCannot add student!\nAt least one field is empty.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (student.age >= 122) {
            studentList.remove(student);
            try {
                throw new RuntimeException("\nCannot add a student that was born in 1900 or earlier!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    } public void listStudentsByDateOfBirth() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void listAllStudentsByAge(int age) {
        System.out.println("\nAll the students with the age of " + age + " are:\n");
        for (Student student : studentList) {
            if (student.age == age) {
                System.out.println(student);
            }
        }
    }
    public void deleteStudentByCnp(String cnp) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.cnp.equals(cnp)) {
                iterator.remove();
                System.out.println("Student " + student.firstName + " " + student.lastName + " has been deleted successfully");
            }
        }
    }
}
