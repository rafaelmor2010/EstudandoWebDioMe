package cursoDioJava.algoritmos;

import java.util.*;

public class TabuadaObjetoScanner {
	
	public static void main(String[] args) {
	
	String nomeUsuario = "Rafael Morales aluno Dio";
	int valorTotal = 0;
	int multiplicador = 0;
	Scanner entradaNumero = new Scanner(System.in);
	
	System.out.println("Tabuada Funciona até 10");
	System.out.println("Digite um número Tabuada");
	int valorEntrada = entradaNumero.nextInt();

	if (valorEntrada > 10 ) {
		System.out.println("Erro! Digite um número menor ou igual 10");
		 valorEntrada = entradaNumero.nextInt();
		
	}
	for (int x  = 0; x < 10; x++) {
		valorTotal = valorEntrada * ++multiplicador;
		System.out.println(valorEntrada+ " X " +multiplicador+ " = " +valorTotal);
		
			}
			
	
	}
}
