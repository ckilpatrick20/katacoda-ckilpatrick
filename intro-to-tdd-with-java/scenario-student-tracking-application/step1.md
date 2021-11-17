## Let's open our file first!
Let's open `src/test/java/StudentTest.java`{{open}}
## Add a test
<pre class="file" data-filename="/java/student-tracking-application/src/test/java/StudentTest.java" data-target="replace">
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {
  @Test
  public void testDisplayStudentName() {
    assertNull(null);
  }
}
</pre>

## Execute!
Let's now run our test!

bash ./gradlew test{{execute}}