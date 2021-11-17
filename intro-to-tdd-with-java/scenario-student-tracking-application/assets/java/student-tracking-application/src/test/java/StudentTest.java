import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void givenStudentName_ThenReturnDisplayName() {
        Student student = new Student();
        String studentName = student.displayStudentName("Smith", "John");
        assertEquals("JohnSmith", studentName);
    }
}