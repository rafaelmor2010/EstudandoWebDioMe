package cursoDioJava.algoritmos;


import java.util.*;

public class EscolhaOpcaoSwitch {
	public static void main(String[] args) {
		
		Scanner numeroEntrada = new Scanner(System.in);
		String nomeUsuario = " Rafael Morales";
		
	
		System.out.println("Escolha uma das op��es - (1 Abrir Netflix) "
				+ "(2 Abrir Amazon Prime (3 Abrir Hbo) ");
	
		
		System.out.println("Digite A O��o:   ");
		
		
		int menu = numeroEntrada.nextInt();
	
				switch (menu) {
					case 1:
						System.out.println(menu+ " Abrir Netflix " + " Usu�rio : "+nomeUsuario);
						break;
					case 2:
						System.out.println(menu+ " Abrir Amazon Prime" + " Usu�rio : "+nomeUsuario);
						break;
					case 3:
						System.out.println(menu+ " Abrir HBO" + " Usu�rio : "+nomeUsuario);
						break;
	     
					default:
						System.out.println("N�mero inv�lido");
						
				}
			
			}
	}


