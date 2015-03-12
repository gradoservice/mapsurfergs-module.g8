// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Gradoservice Maven repository" at "http://git.prochar.ru/maven/"

// The Typesafe SNAPSHOT repository
resolvers += Resolver.url("Typesafe Ivy Snapshots Repository", url("http://repo.typesafe.com/typesafe/ivy-snapshots/"))(Resolver.ivyStylePatterns)

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.1.0")

addSbtPlugin("com.typesafe" % "play-plugins-dust" % "1.5-SNAPSHOT")

addSbtPlugin("com.gradoservice" % "play-plugins-jsapplication" % "1.0")
