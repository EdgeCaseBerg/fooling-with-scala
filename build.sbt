lazy val commonSettings = Seq(
	organization := "com.example",
	scalaVersion := "2.10.4",
	version := "0.1.0"
)

lazy val root = (project in file("."))
	.settings(commonSettings:_*)
	.settings(
		name := "hello",
		version := "1.0"
)
