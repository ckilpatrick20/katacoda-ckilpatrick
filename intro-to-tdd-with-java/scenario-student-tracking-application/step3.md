## Time to refactor
<pre class="file" data-filename="src/main/java/Student.java" data-target="insert"  data-marker="public class Student {">
public class Student {
  String firstName;
  String lastName;
  String displayName;  

  public String displayStudentName(String firstName, String lastName) {
    displayName = firstName + lastName;
    return displayName;
  }
}
</pre>