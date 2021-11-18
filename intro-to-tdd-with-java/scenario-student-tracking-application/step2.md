Congratulations! We've written our first test.

## StudentTest.java

Let's complete the first stage of TDD by running our test. We are expecting this test to fail, or be <span style="color:red">red</span>.
### Run your first test <span style="color:red">(RED STAGE)</span>

Type the following command into the consule to run our first test:

`bash ./gradlew test`{{execute}}

### Failure is an option
```
BUILD FAILED in 1s
2 actionable tasks: 2 executed
```
*This is an example of an error message you may receive. Do not worry if your error message looks a little different.*

This is exactly what we were expecting. The `student.displayStudentFullName` method does not exist yet which means this test should and will fail.

Now you're ready for the next stage of TDD, making the test go <span style="color:green">green</span>!