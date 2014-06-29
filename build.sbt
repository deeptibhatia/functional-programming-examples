name := "practice"

version := "1.0"

scalaVersion := "2.11.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies ++= {
  Seq(
    "org.specs2"          %%  "specs2"        % "2.3.12" % "test",
    "org.scalatest" %% "scalatest" % "2.2.0" % "test",
    "junit" % "junit" % "4.10" % "test",
    "commons-io" % "commons-io" % "2.1",
    "org.joda" % "joda-convert" % "1.1",
    "joda-time" % "joda-time" % "2.3",
    "com.github.scopt" %% "scopt" % "3.2.0",
    "org.eclipse.mylyn.github" % "org.eclipse.egit.github.core" % "2.1.5",
    "org.specs2"          %%  "specs2-core"        % "2.3.12" % "test",
    "org.scalatest" %% "scalatest" % "2.2.0" % "test",
    "junit" % "junit" % "4.10" % "test"
  )
}
