object App {
  implicit val caseInsensitive = Ordering.comparatorToOrdering(String.CASE_INSENSITIVE_ORDER)

  val names = List(
    "Ray Kemp",
    "Nicolas Leroux",
    "Vincent Grente",
    "Vijay Kiran")

  def main(args: Array[String]) {
    val sortedNames = (names ++ args).sorted
    for {
      name <- sortedNames
    } println(s"Hello, $name!")
  }
}
