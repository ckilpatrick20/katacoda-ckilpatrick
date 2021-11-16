# Step 1

<pre class="file" data-filename="/java/student-tracking-application/src/test/java/StudentTest.java" data-target="replace">var http = require('http');
var requestListener = function (req, res) {
  res.writeHead(200);
  res.end('Import org.junit.Test;
Import static org.junit.Assert.*;
public class StudentTest {
  @Test
  public void testDisplayStudentName() {
    assertNotNull(null);
  }
}');
}

var server = http.createServer(requestListener);
server.listen(3000, function() { console.log("Listening on port 3000")});
</pre>