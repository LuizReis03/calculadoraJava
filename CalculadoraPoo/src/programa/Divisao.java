package programa;

import interfaces.ICalculadora;

public class Divisao implements ICalculadora {

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		Integer divisao = n1 / n2;
		if (n1 == 0 || n2 == 0) {
			System.out.println("Não é possível realizar divisões com 0!");
			return null;
		}
		return divisao;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		Float divisao = n1 / n2;
		if (n1 == 0.0 || n2 == 0.0) {
			System.out.println("Não é possível realizar divisões com 0.0!");
			return null;
		}
		return divisao;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		Double divisao = n1 / n2;
		if (n1 == 0 || n2 == 0) {
			System.out.println("Não é possível realizar divisões com 0.0!");
			return null;
		}
		return divisao;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer tamanho = numeros.length;
		if (tamanho == 0) {
			System.out.println("É necessário de 2 valores ou mais para fazer a divisao");
			return null;
		}
		
		Integer divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
		}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Integer tamanho = numeros.length;
		if (tamanho == 0) {
			System.out.println("É necessário de 2 valores ou mais para fazer a divisao");
			return null;
		}
		
		Float divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
		}
		return divisao;
	}

	@Override
	public Double calcula(Double[] numeros) { 
		Integer tamanho = numeros.length;
		if (tamanho == 0) {
			System.out.println("É necessário de 2 valores ou mais para fazer a divisao");
			return null;
		}
		
		Double divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
		}
		return divisao;
	}
}