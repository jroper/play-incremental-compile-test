name := "test"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies += "play" %% "play" % "2.1.1"

unmanagedSourceDirectories in Compile <+= baseDirectory / "src/main/scala-generated"
