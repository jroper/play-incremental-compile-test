name := "play-inc-compile-test"

organization := "play.test"

version := "0.1"

resolvers += Resolver.url("Typesafe repository", new java.net.URL("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.defaultIvyPatterns)

ScriptedPlugin.scriptedSettings

scriptedBufferLog := false

scriptedLaunchOpts ++= Seq("-XX:MaxPermSize=384M", "-Xmx1024M")
