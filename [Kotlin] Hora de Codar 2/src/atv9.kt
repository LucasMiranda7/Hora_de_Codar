fun main(){
    //exercicio 9

    println("Insira seu Ano de Nascimento: ")
    var ano_nascimento = readln().toInt()
    val anoAtual = 2024
    var calcIdade = anoAtual - ano_nascimento

    if(calcIdade >= 16){
        println("Pode votar")
    }
    else{
        println("Não pode votar!")
    }
}