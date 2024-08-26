programa
{
	
	funcao inicio()
	{
		inteiro valor, quantidade = 0, contador, contagem_numeros = 0

		para(contador = 0; contador < 10; contador++){
			escreva("Insira (DEZ) valores: ")
			leia(valor)

			se(valor >= 24 e valor <= 42){
				contagem_numeros += 1
				quantidade = valor
			}
		}
		escreva("A quantidade de valores que estão entre os números 24 e 42 é: ", contagem_numeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */