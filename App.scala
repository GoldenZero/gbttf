object App {
  val names = List(
    "Ray Kemp",
    "Nicolas Leroux",
    "Vincent Grente",
    "Vijay Kiran",
    "Workshop people")

  def main(args: Array[String]) {
    val sortedNames = (names ++ args).sorted
    for {
      name <- sortedNames
    } println(s"Hello, $name!")
  }
}
