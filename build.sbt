organization := "th.pt"
name := "calmunnist"
version := "1.0.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.7"
  , "org.scala-lang" % "scala-reflect" % scalaVersion.value
  , "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.6"
  , "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
  , "joda-time" % "joda-time" % "2.9.7"
  , "org.scalaj" %% "scalaj-http" % "2.3.0"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

crossScalaVersions := Seq("2.11.8", "2.12.1")

publishTo := Some("Artifactory Realm" at "https://artifact.billme.in.th/artifactory/billme-public")

credentials += Credentials("Artifactory Realm", "artifact.billme.in.th", "admin", "")
