fun main(){
    //trápezio


    println("Insira a Base maior do Losango: ")
    val base_maior: Float = readln().toFloat()

    println("Insira a Base menor do Losango: ")
    val base_menor: Float = readln().toFloat()

    println("Insira a Altura do Losango: ")
    val altura: Float = readln().toFloat()

    val area: Float
    area = (base_maior + base_menor)*altura / 2
    println("A aréa total do Losango é: $area")
}