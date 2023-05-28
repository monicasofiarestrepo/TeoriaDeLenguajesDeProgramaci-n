class Vehiculo(marca: String, tipo: String, ano: Int) {
  def Descripcion(): Unit = {
    println("\nVehículo de marca: " + marca + "\nTipo: " + tipo + "\nAño de fabricación: " + ano)
  }
}

class VehiculoAlquilado(marca: String, tipo: String, ano: Int,
    inicioAlquiler: String, finAlquiler: String, nombreCliente: String, precio: Int) extends Vehiculo(marca, tipo, ano) {
  def Informacion(): Unit = {
    Descripcion()
    println("Inicio de alquiler: " + inicioAlquiler +
        "\nFinal de alquiler: " + finAlquiler +
        "\nNombre cliente: " + nombreCliente +
        "\nPrecio: " + precio
    )
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val Lambo = new Vehiculo("Lamborghini", "Huracán morado", 2018)
    Lambo.Descripcion()

    val MaseratiAlquilado = new VehiculoAlquilado("Maserati", "Modelo XD", 2022, "13 mayo", "28 mayo", "Moni", 2300000)
    MaseratiAlquilado.Informacion()
  }
}
