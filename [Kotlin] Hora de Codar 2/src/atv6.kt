fun main(){
    //exercicio 6

    var list = mutableListOf<Int>()

    for (i in 1..4){
        println("Insira (quatro) valores: ")
        list.add(readln().toInt())
    }

    var maior: Int
    maior = list[0]

    if (list[1] > maior){
        maior = list[1]
    }
    if (list[2] > maior){
        maior = list[2]
    }
    if (list[3] > maior){
        maior = list[3]
    }
    print("----- TODOS OS VALORES ABAIXO -------" + "\nO primeiro valor é:  " + list[0] + "\nO último valor é: " + list[3] + "\nO maior valor é $maior ")
}
