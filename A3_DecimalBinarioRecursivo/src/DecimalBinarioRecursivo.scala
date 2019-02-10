import scala.io.StdIn._

object DecimalBinarioRecursivo {
  
  def decimalBinario(num:Int) : Unit = {
    var bin = ""
    if(num >= 2){
      bin += num%2
      decimalBinario(num/2)
    }
    else if (num < 2 && num >= 0){
      bin += num
    }
    print(bin)
  }
  
  def main(args: Array[String]): Unit = {
    println("Inserta numero decimal entero: ")
    var num = readInt()
    println("El numero binario es: ")
    decimalBinario(num)
  }
}