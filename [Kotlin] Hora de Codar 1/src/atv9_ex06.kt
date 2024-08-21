fun main(){
    //triângulo


    println("Insira a Base do Triângulo: ")
    val base: Float = readln().toFloat()

    println("Insira a Altura do Triângulo: ")
    val altura: Float = readln().toFloat()

    val area: Float
    area = (base*altura) / 2
    println("A aréa total do Triângulo é: $area")
}