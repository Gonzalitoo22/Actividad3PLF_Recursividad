import scala.io.StdIn._

object SumatoriaNumerosEnterosRecursividad {
  def sumatoria(limiteI : Int, limiteF : Int) : Int ={
   if(limiteI <= limiteF){
      limiteI + sumatoria(limiteI + 1, limiteF)
    }else{
      0
    }
    //return suma
  }
  def main(args: Array[String]): Unit = {
    println("Inserta limite inicial:")
    var limiteI = readInt()
    println("Inserta limite final:")
    var limiteF = readInt()
    println("La sumatoria es: "+sumatoria(limiteI, limiteF))
  }
}