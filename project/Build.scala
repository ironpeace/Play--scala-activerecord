import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "scalaActiveRecordSample"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "com.github.aselab" % "scala-activerecord" % "0.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
      resolvers ++= List(
        "aselab repo" at "http://aselab.github.com/maven/"
      )
    )

}
