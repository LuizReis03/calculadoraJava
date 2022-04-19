package programa;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.calculadora.classe.Multiplicacao;
import classe.Subtracao;
import interfaces.ICalculadora;

public class ExemploPrograma {	
	
	public static void main(String args[]) {

		ICalculadora soma = new Soma();
		ICalculadora div = new Divisao();	
		interfaces.ICalculadora sub =  new Subtracao();
		br.com.calculadora.interfaces.ICalculadora mult = new Multiplicacao();
		
		do {
			Integer opc = menu();
			ArrayList<Double> entrada = valorUsuario();
			Double data[] = new Double[entrada.size()];
			
			for (int i = 0; i < entrada.size(); i++) {
				data[i] = entrada.get(i);
			}
			
			String tipoEntrada = verificaTipoEntrada(data);
			switch (opc) {
			case 1: {
				if (tipoEntrada == "inteiro") {
					System.out.println(soma.calcula(convertDoubleToInt(data)));
				}else if(tipoEntrada == "float") {
					System.out.println(soma.calcula(convertDoubleToFloat(data)));
				}else {
					System.out.println(soma.calcula(data));
				}
				break;
			}
			case 2: {
				if (tipoEntrada == "inteiro") {
					System.out.println(sub.calcula(convertDoubleToInt(data)));
				}else if(tipoEntrada == "float") {
					System.out.println(sub.calcula(convertDoubleToFloat(data)));
				}else {
					System.out.println(sub.calcula(data));
				}
				break;
			}
			case 3: {
			if (tipoEntrada == "inteiro") {
				System.out.println(mult.calcula(convertDoubleToInt(data)));
			}else if(tipoEntrada == "float") {
				System.out.println(mult.calcula(convertDoubleToFloat(data)));
			}else {
				System.out.println(mult.calcula(data));
			}
				break;
			}			
			case 4: {
				if (tipoEntrada == "inteiro") {
					System.out.println(div.calcula(convertDoubleToInt(data)));
				}else if(tipoEntrada == "float") {
					System.out.println(div.calcula(convertDoubleToFloat(data)));
				}else {
					System.out.println(div.calcula(data));
				}
				break;
			}
			default:
				System.out.println("\nPrograma encerrado!!");
				System.exit(0);
			}
		} while (menu() != 5);
		
	}
	
	public static Integer menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----CALCULADORA-----");
		System.out.println("1-Soma\n2-Subtração\n3-Multipicação\n4-Divisão\n5-Sair");
		Integer opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public static ArrayList<Double> valorUsuario() {
		ArrayList<Double> entrada = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		Integer escolha = 0;
		
		do {
		System.out.println("Digite o número:");
		if (scan.hasNextDouble()) {
			entrada.add(scan.nextDouble());
		}			
		if (entrada.size() >= 2) {
			System.out.println("Você deseja iserir mais número? \n1 - SIM \n2 - NÃO");
			escolha = scan.nextInt();
		}
		
	} while (entrada.size() < 2 || escolha == 1);
		
		
		
		return entrada;
	}
	
	public static String verificaTipoEntrada(Double[] entrada) {
		Integer numeroEntradaInteiros = 0;
		Integer numeroEntradaFloat = 0;
		Integer numeroEntradaDouble = 0;
		for (int i = 0; i < entrada.length; i++) {
			
			double n = entrada[i];
			
			if ((int) n == n) {
				numeroEntradaInteiros++;
			} else if (Double.toString(n).split("\\.")[1].length() < 7) {
				numeroEntradaFloat++;
			} else {
				numeroEntradaDouble++;
			}			
		}
		
		if (numeroEntradaInteiros > 0 && numeroEntradaFloat == 0 && numeroEntradaDouble == 0) {
			return "inteiro";
		}
		
		if ((numeroEntradaInteiros > 0 || numeroEntradaInteiros == 0) && numeroEntradaFloat > 0 && numeroEntradaDouble == 0) {
			return "float";
		}
		
		return "double";
	}
	
	public static Float[] convertDoubleToFloat(Double[] array2) {
	    Float[] arr = new Float[array2.length];
	    for (int i = 0; i < array2.length; i++) {
	        arr[i] = Float.parseFloat(array2[i].toString());
	    }
	    return arr;
	}
	
	public static Integer[] convertDoubleToInt(Double[] array2) {
	    Integer[] arr = new Integer[array2.length];
	    for (int i = 0; i < array2.length; i++) {
	        arr[i] = (int) array2[i].doubleValue();
	    }
	    return arr;
	}
}
