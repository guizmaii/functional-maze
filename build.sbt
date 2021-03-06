name := "functional-maze"
version := "0.0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.12.3"

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8", // source files are in UTF-8
  "-deprecation", // warn about use of deprecated APIs
  "-unchecked", // warn about unchecked type parameters
  "-feature", // warn about misused language features
  "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
  "-Xlint", // enable handy linter warnings
  "-Xfatal-warnings", // turn compiler warnings into errors
  "-Ypartial-unification", // allow the compiler to unify type constructors of different arities
  "-language:implicitConversions"
)

resolvers += Resolver.sonatypeRepo("releases")

val catsCoreVersion = "1.3.1"

val validationVersion = "2.1.0"

libraryDependencies ++= Seq(
  "org.typelevel"           %% "cats-core"     % catsCoreVersion,
  "org.typelevel"           %% "cats-effect"   % "1.0.0",
  "org.typelevel"           %% "cats-mtl-core" % "0.3.0",
  "org.scalaz"              %% "scalaz-zio"    % "0.2.6",
  "com.googlecode.lanterna" % "lanterna"       % "3.0.1"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")
