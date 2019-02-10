import scala.io.StdIn._

object CocientesEnterosRecursivo {
  def divisores(nMenor:Int, nMayor : Int) : Unit ={
    if(nMayor >= nMenor && nMayor%nMenor==0){
      println(nMenor)
      divisores(nMenor + 1, nMayor)
    }else if(nMayor >= nMenor){
      divisores(nMenor + 1, nMayor)
    }
  }
  def main(args: Array[String]): Unit = {
    println("Inserta número menor:")
    var nMenor = readInt()
    println("Inserta número mayor:")
    var nMayor = readInt()
    println("Los divisores exactos entre el numero menor y el numero mayor")
    divisores(nMenor, nMayor)
  }
}