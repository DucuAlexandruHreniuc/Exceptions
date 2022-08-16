package ro.siit.ExceptionsHW;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.Assert;


class StudentRepositoryTest {
    @Test
    public void addStudentTest(){
        StudentRepository repoTest = new StudentRepository();
        repoTest.addStudent(new Student("George" , "Gepeto" , "1998-01-29" , Gender.Male, "1983012848321"));
        for (Student student : repoTest.studentList) {
            Assertions.assertEquals(student, student);
        }
    }@Test
    public void listAllStudentByAgeTest(){
        StudentRepository repoTest = new StudentRepository();
        repoTest.addStudent(new Student("Testo", "Testolescu", "1998-03-03", Gender.Male, "1983109284102"));
        repoTest.listAllStudentsByAge(24);
        //Assertions.assertEquals();

    }
}