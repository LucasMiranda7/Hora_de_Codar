fun main(){
    //exercicio3

    val numero1: Int
    val numero2: Int
    val numero3: Int
    val recebedor: Int

   println("Insira o primeiro valor: ")
    numero1 = readln().toInt()

    println("Insira o segundo valor: ")
    numero2 = readln().toInt()

    println("Insira o terceiro valor: ")
    numero3 = readln().toInt()

 if(numero1 > numero2 && numero1 > numero3){
     recebedor = numero1
 } else if (numero2 > numero1 && numero2 > numero3){
     recebedor = numero2
 } else if (numero3 > numero1 && numero3 > numero2){
     recebedor = numero3
 } else{
     println("Os valores são iguais")
     return
 }
    println("O maior valor é $recebedor")

}