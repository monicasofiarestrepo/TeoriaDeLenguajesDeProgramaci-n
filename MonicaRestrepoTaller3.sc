import scala.util.matching.Regex

def regexAutomoviles(placas: List[String]): List[String] = {
  val regex = """[A-Z]{3} \d{3}""".r
  placas.filter(regex.matches)
}

def regexVehiculosCarga(placas: List[String]): List[String] = {
  val regex = """\d{3} [A-Za-z]""".r
  placas.filter(regex.matches)
}

def regexMotos(placas: List[String]): List[String] = {
  val regex = """[A-Za-z]{4,5}\d{3}""".r
  placas.filter(regex.matches)
}


val listaPlacas = List("XNF 400", "JFKE23", "324 E", "FJF 434")

val automoviles = regexAutomoviles(listaPlacas)
println(automoviles)  


