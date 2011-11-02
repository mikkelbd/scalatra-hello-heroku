import org.scalatra._
import java.net.URL
import scalate.ScalateSupport

class MyScalatraServlet extends ScalatraServlet with ScalateSupport {

  get("/") {
    <html>
      <body>
        <h1>Hello, Scala!</h1>
        <!--Say <a href="hello-scalate">hello to Scalate</a>.-->
      </body>
    </html>
  }
}

