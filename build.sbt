import com.typesafe.startscript.StartScriptPlugin

organization := "com.github.mikkelbd"

name := "scalatra-hello"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

seq(webSettings:_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.1",
  "org.scalatra" %% "scalatra-scalate" % "2.0.1",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "jetty",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725",
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

seq(StartScriptPlugin.startScriptForClassesSettings: _*)