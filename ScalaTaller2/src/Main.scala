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
    def procesoALista(numeros: List[Int]): List[Int] = {

      def multiplicarSiImpar(num: Int): Int = {
        if (num % 2 != 0) num * 2
        else num
      }

      def sortDiferenteDescendiente(numeros: List[Int]): List[Int] = {
        if (numeros.isEmpty) List()
        else {
          val head = numeros.head
          val tail = numeros.tail

          val numeroMult = multiplicarSiImpar(head)
          val tailsita = sortDiferenteDescendiente(tail)

          if (tailsita.contains(numeroMult))
            tailsita
          else numeroMult :: tailsita
        }
      }

      val listaRes=sortDiferenteDescendiente(numeros)

      listaRes
    }

    val Listica = List(1, 2, 3, 4, 5, 6, 7)
    val Listota = listaRes(Listica)
    print(Listota)
}
}
