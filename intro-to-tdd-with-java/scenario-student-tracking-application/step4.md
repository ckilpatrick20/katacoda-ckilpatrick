
---
## Time to refactor

Welcome to the last stage of the TDD cycle, <span style="color:blue">refactoring</span>. During this stage, we revisit the unit test and code we have previously written to refactor:
- Update our unit tests to adhear to the [arrange-act-assert](https://automationpanda.com/2020/07/07/arrange-act-assert-a-pattern-for-writing-good-tests/) pattern
- Remove any hard-coded values
- Update our `Student` class and `displayStudentFullName` method

### StudentTest.java
Open the `src/test/java/StudentTest.java`{{open}} file.

We can begin by following the arrange-act-assert pattern to ensure we are writing good tests. We do this by adding the following comment lines to our unit test:
```java
// arrange
// act
// assert
``` 

Copy the updated test method with comments to the `StudentTest.java` file:
<pre class="file" data-filename="src/test/java/StudentTest.java" data-target="replace">
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

  @Test
  public void givenStudentFirstLasName_ThenReturnFullName() {
    // arrange
    Student student = new Student();

    // act
    String studentName = student.displayStudentFullName("John", "Smith");

    // assert
    assertEquals("JohnSmith", studentName);
  }
}
</pre>

Our unit test looks much better now and it is more clear to other developers what we are trying to accomplish. The arrange-act-assert pattern forces us to write tests that focus on independent, individual behaviors by separating setup actions from the main actions.

### Student.java

We can now start refactoring the `src/main/java/Student.java`{{open}} file.

Begin refactoring by adding class attributes and updating the method to use them.

Copy the method below to the `Student.java` file:
<pre class="file" data-filename="src/main/java/Student.java" data-target="replace">
public class Student {  
  String firstName;
  String lastName;
  String displayName;  

  public String displayStudentFullName(String firstName, String lastName) {
    displayName = firstName + lastName;
    return displayName;
  }
}
</pre>

### Rerun our unit test
Now we will rerun our unit test from Step 1 to ensure we did not break our code.

`bash ./gradlew test`{{execute}}

```gradle
BUILD SUCCESSFUL in 2s
3 actionable tasks: 3 executed
```

Another successful build!

The success of this last test demonstrates just how empowering TDD is. We now have the confidence to go back and refactor our code as needed because we have unit tests written against a known working state. If during the refactor stage we run our tests again and one of them is failing, we get immediate feedback and know we broke something.

Now that we have completed one full cycle of TDD, we will start back at the beginning by writting another unit test we expect to go <span style="color:red">red</span>.