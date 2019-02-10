import scala.io.StdIn._

object ContarDivisores {
  def divisores(nMenor:Int, nMayor : Int, c : Int) : Unit ={
    if(nMayor >= nMenor && nMayor%nMenor==0){
      divisores(nMenor + 1, nMayor, c + 1)
    }else if(nMayor >= nMenor){
      divisores(nMenor + 1, nMayor, c)
    }
    if(nMayor == nMenor){
      println(c)
    }
  }
  def main(args: Array[String]): Unit = {
    println("Inserta número menor:")
    var nMenor = readInt()
    println("Inserta número mayor:")
    var nMayor = readInt()
    var c = 1
    println("El numero de divisores exactos entre el numero menor y el numero mayor")
    divisores(nMenor, nMayor, c)
  }
}