scalaVersion := "2.12.2"

wartremoverErrors in (Compile, compile) := List(Wart.ArrayEquals)
