object Main {

  def main(args: Array[String]): Unit = {
    //primer punto
    val listaInicial = List('a', 'B', 'c')

    val listaTransformada = listaInicial.map((letra: Char) => {
      List(letra.toUpper, letra.toLower)
    })
    println(listaTransformada)


    //segundo punto
    val listaNombres = List("Andres David", "Camilo", "Juan")

    val listaNombresFiltrados = listaNombres.filter(nombre => nombre.startsWith("A") && nombre.length > 6)

    println(listaNombresFiltrados)

    //tercer punto

    val listaCaracteres = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    listaCaracteres.foreach { caracter =>
      if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
        println(true)
      }
    }

    //cuarto punto
    
    def processList(numbers: List[Int]): List[Int] = {
      def multiplyIfOdd(number: Int): Int = {
        //caso base
        if (number %2 == 0) number
          //si es un numero par, se detiene
        else
          number * 2
      }

      val ListaSort = numbers.map(multiplyIfOdd).distinct.sorted.reverse
      ListaSort
    }

    val listaImput = List(1, 2, 3, 4, 5, 6, 7)
    val listaOutput = processList(listaImput)

    println(listaOutput)

  }
}
