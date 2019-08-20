
name := "gatling-dubbo"

version := "2.0.2"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "io.gatling" % "gatling-core" % "2.3.1" % "provided",
  "com.alibaba" % "dubbo" % "2.6.5" % "provided",
)
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
