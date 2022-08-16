package ro.siit.ExceptionsHW;
import org.apache.logging.log4j.LogManager;

public class Main {
    public static void main(String[] args) {
        try {
            StudentRepository repository = new StudentRepository();
            repository.addStudent(new Student("Viorel", "Viorescu", "2007-06-21", Gender.Male, "105213125125"));
            repository.addStudent(new Student("Rebeca", "Stanescu", "1991-12-15", Gender.Female, ""));
            repository.addStudent(new Student("Alex", "Alexescu", "2003-02-14", Gender.Male, "120041412431"));
            repository.addStudent(new Student("Bogdana", "Bogdanovici", "1953-01-01", Gender.Female, "12313541251"));
            repository.addStudent(new Student("Oldie", "McOldingson", "1900-01-01", Gender.Female, "193949129431"));
            repository.addStudent(new Student("Ricardo", "Esteban", "2003-03-05", Gender.Male, "198313141214"));
            repository.addStudent(new Student("Impostor", "Impostorovic", "1998-03-03", Gender.Male, "1980303244501"));
            repository.listAllStudentsByAge(19);
            repository.listStudentsByDateOfBirth();
            repository.deleteStudentByCnp("1980303244501");
        } catch (Exception e) {
            org.apache.logging.log4j.Logger log4jlogger = LogManager.getLogger(Main.class);
            log4jlogger.error("Error");
        }
    }
}