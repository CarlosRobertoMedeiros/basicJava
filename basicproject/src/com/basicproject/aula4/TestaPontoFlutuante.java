package com.basicproject.aula4;

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		// Ponto Flutuante
		// double e float

		double salario = 1270.50;
		System.out.println("Meu salário é :" + salario);

		double idade = 37;
		System.out.println("Minha idade é :" + idade);

		double resultado = 3.14 / 2;
		System.out.println("Resultado da divisão :" + resultado);
		
		//Outra divisão Inteiro por inteiro da Inteiro
		//O Java trunca limitando ao tipo
		int inteiro = 5/2;
		System.out.println("Valor Inteiro: "+inteiro);
		
		//Pegadinha
		//Nesse cenário como os 2 valores são inteiros ele faz a divisão, em seguida verifica que o 
		//valor "cabe" em double, pois double e maior que int
		//assim ele imprime o 2.0
		//Divide int por int
		double novaTentativa = 5/2;
		System.out.println("Valor Inteiro: "+novaTentativa);
		
		//Pare resolver o problema acima
		//Basta forçar um número como ponto flutuante
		//Imprimindo o 2.5
		//Divide Double por Int
		double novaTentativa2 = 5.0/2;
		System.out.println("Valor Inteiro: "+novaTentativa2);
		
		
		

	}

}
