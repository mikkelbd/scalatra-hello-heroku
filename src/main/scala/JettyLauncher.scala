import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{DefaultServlet, ServletContextHandler}
import org.eclipse.jetty.server.nio.SelectChannelConnector

object JettyLauncher {
	def main(args: Array[String]) {
		val port = if(System.getenv("PORT") != null) System.getenv("PORT").toInt else 8080
		println("Jetty starting on port: " + port)
		val server = new Server
		val scc = new SelectChannelConnector
		scc.setPort(port)
		server.setConnectors(Array(scc))

		val context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)
		//	context.addFilter(classOf[MyScalatraFilter], "/*", 0)
		context.addServlet(classOf[MyScalatraServlet], "/*");
		context.addServlet(classOf[DefaultServlet], "/");
		context.setResourceBase("src/main/webapp")

		server.start
		server.join
	}
}