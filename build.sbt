name := "foundations-scala"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.scalactic"   %%  "scalactic"   % "3.0.5",
  "org.scalatest"   %%  "scalatest"   % "3.0.5" % "test",
  "com.typesafe"    %   "config"      % "1.3.2"
)