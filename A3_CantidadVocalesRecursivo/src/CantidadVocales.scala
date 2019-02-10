import scala.io.StdIn._

object CantidadVocales {
  
  def numeroVocales(cadena : String, inicio : Int, fin : Int, v : Int) : Unit = {
    if(inicio <= cadena.length()-1){
      if(cadena.substring(inicio, fin).toLowerCase().equals("a")|| cadena.substring(inicio, fin).toLowerCase().equals("e")||
          cadena.substring(inicio, fin).toLowerCase().equals("i")|| cadena.substring(inicio, fin).toLowerCase().equals("o")||
          cadena.substring(inicio, fin).toLowerCase().equals("u")){
        numeroVocales(cadena, inicio + 1, fin + 1, v + 1)
      }
      else{
        numeroVocales(cadena, inicio + 1, fin + 1, v)
      }
    }
    if(cadena.length() == inicio){
      println(v)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Inserta una cadena: ")
    var cadena = readLine()
    var inicio = 0
    var fin = 1
    var v = 0
    println("Numero de vocales: ")
    numeroVocales(cadena, inicio, fin, v)
  }
}