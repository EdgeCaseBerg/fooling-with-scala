lazy val hello = taskKey[Unit]("An example task") 

lazy val commonSettings = Seq(
	organization := "com.example",
	scalaVersion := "2.10.4",
	version := "0.1.0"
)

lazy val root = (project in file("."))
	.settings(commonSettings:_*)
	.settings(
		name := "hello",
		version := "1.0",
		hello := { 
			println("Hello!") 
		}
	)

cleanFiles += file("/tmp/data.txt")
