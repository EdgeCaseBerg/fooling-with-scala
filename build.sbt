lazy val helloTask = taskKey[Unit]("An example task") 
lazy val multiTask = taskKey[Unit]("An example task showing aggregates") 

lazy val commonSettings = Seq(
	organization := "com.example",
	scalaVersion := "2.10.4",
	version := "0.1.0"
)

lazy val hello = (project in file("hello"))
	.settings(commonSettings:_*)
	.settings(
		name := "hello",
		version := "1.0",
		helloTask := { 
			println("Hello!") 
		}
	)

lazy val util = (project in file("util"))
	.settings(commonSettings:_*)
	.settings(
		name := "util",
		version := "1.0"
	)

lazy val multi = (project in file("."))
	.aggregate(util, hello).dependsOn(util)

cleanFiles += file("/tmp/data.txt")
