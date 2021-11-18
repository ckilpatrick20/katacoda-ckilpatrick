Welcome to TDD. Please give the environment a chance to fully load. This process usually takes less than a minute.

---
## Project File Structure

The project file structure is listed below. We will be working in `Student.java` and `StudentTest.java`. You should need to edit any of the other files for this scenario.

```
project
+-- gradle
|
+-- src
|   +-- main
|       +-- java
|           -- Student.java
|   +-- test
|       +-- java
|           -- StudentTest.java
+-- build.gradle
+-- gradlew
+-- gradle.bat
+-- settings.gradle
```

## StudentTest.java
TDD starts with testing before any development. Let's start by opening up our `StudentTest.java` file to begin writting our JUnit code.

Open `src/test/java/StudentTest.java`{{open}}.

As you can see, there's not not much here yet except for a few import statements and an empty `StudentTest` class. Let's start by looking at our first requirement so we know what test we need to write first.

**Requirement:**
- Create a function that will concatenate a student's first and last name and return the new string

### Writing your first test

For our first test, we're going to create a new test method called `givenStudentName_ThenReturnDisplayName`. The test asserts that `studenFulltName` is equal to the concatination of the student's first and last name when we call our `displayStudentFullName` function (**NOTE** there's no code in our `Student.java` file so we expect this test will fail).

Copy the test function below to the `StudentTest.java` file:

<pre class="file" data-filename="src/test/java/StudentTest.java" data-target="replace">
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
  @Test
  public void givenStudentName_ThenReturnDisplayName() {
    Student student = new Student();
    String studentName = student.displayStudentName("John", "Smith");
    assertEquals("JohnSmith", studentName);
  }
}
</pre>
