fun main(){
    //losango
    println("Insira a Diagonal maior do Losango: ")
    val diagonal_maior: Float = readln().toFloat()

    println("Insira a Diagonal menor do Losango: ")
    val diagonal_menor: Float = readln().toFloat()

    val area: Float
    area = (diagonal_maior * diagonal_menor) / 2
    println("A aréa total do Losango é: $area")

}