import scala.io.StdIn._

object FactorialRecursivo {
  def factorialRecursivo(n:Int) : Int = {
    if(n == 0)
      1
    else
      factorialRecursivo(n-1)*n
  }
  def main(args: Array[String]): Unit = {
    println("Inserta número para obtener el factorial:")
    var n = readInt()
    println("El factorial es: " + factorialRecursivo(n))
  }
}