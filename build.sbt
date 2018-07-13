name := "fishy-scala-swing-scala"

version := "1.0"

// NAA.
// NLA, we can only use scala-swing library based on Scala 2.11.0
//scalaVersion := "2.12.6"
scalaVersion := "2.11.0"

EclipseKeys.withSource := true
EclipseKeys.withJavadoc := true

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

// https://mvnrepository.com/artifact/org.scala-lang/scala-swing/2.11.0-M7
libraryDependencies += "org.scala-lang" % "scala-swing" % "2.11.0-M7"


