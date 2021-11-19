
---
## Student.java

Now that we've written our failing test, we know what we need to do next. We need to write just enough code to make the test go <span style="color:green">green</span>.

Start by opening the `src/main/java/Student.java`{{open}} file.

### The Bare Minimum

Our goal is to write the minimum amount of code to get the test to go <span style="color:green">green</span>. We will refactor the code in future steps, so our main aim here is to just get something working.

Copy the method below into the `Student.java` file:

<pre class="file" data-filename="src/main/java/Student.java" data-target="replace">
public class Student {
  public String displayStudentFullName(String firstName, String lastName) {
    return firstName + lastName;
  }
}
</pre>

### Running our first test...again <span style="color:green">(GREEN STAGE)</span>

Now that we have created our `displayStudentFullName` method and written just enough code to get the JUnit test to pass, it is time to run our test again. This time around, we should see our test go from <span style="color:red">red</span> to <span style="color:green">green</span>.

Type the following command into the consule to run our first test again:

`bash ./gradlew test`{{execute}}

Now it's time for the advanced stuff, refactoring!