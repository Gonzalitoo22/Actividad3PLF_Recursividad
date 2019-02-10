import scala.io.StdIn._

object DivisoresNumero {
  def divisores(numero:Int, num : Int) : Unit ={
    if(numero > 0 && num%numero==0){
      println(numero)
      divisores(numero-1, num)
    }else if(numero > 0){
      divisores(numero-1, num)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Inserta número:")
    var numero = readInt()
    var num = numero
    println("Los divisores son: ")
    divisores(numero, num)
  }
  
}