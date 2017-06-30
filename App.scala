object App {
  val names = List(
    "Ray Kemp",
    "Nicolas Leroux",
    "Vincent Grente",
    "Vijay Kiran")

  def main(args: Array[String]) {
    for {
      name <- (names ++ args).sortBy(_.toLowerCase)
    } println(s"Hello, $name!")
  }
}
