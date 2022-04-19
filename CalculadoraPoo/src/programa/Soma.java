package programa;

import interfaces.ICalculadora;

public class Soma implements ICalculadora {

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if (n1 == null || n2 == null) {
			System.out.println("Os dois números devem ser inseridos!!");
		}
		return n1 + n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if (n1 == null || n2 == null) {
			System.out.println("Os dois números devem ser inseridos!!");
		}
		return n1 + n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if (n1 == null || n2 == null) {
			System.out.println("Os dois números devem ser inseridos!!");
		}
		return n1 + n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer soma = 0;
		Integer tamanho = numeros.length;
		if (tamanho == 0 || tamanho == 1) {
			System.out.println("É necessário de 2 valores ou mais para fazer a soma");
		}
		
		for(Integer i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}
				
		return soma;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float soma = 0F;
		Integer tamanho = numeros.length;
		
		if (tamanho == 0 || tamanho == 1) {
			System.out.println("É necessário de 2 valores ou mais para fazer a soma");
		}
		
		for(Integer i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}
		return soma;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double soma = 0D;
		Integer tamanho = numeros.length;
		if (tamanho == 0 || tamanho == 1) {
			System.out.println("É necessário de 2 valores ou mais para fazer a soma");
		}
		
		for(Integer i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}
		return soma;
	}
}
