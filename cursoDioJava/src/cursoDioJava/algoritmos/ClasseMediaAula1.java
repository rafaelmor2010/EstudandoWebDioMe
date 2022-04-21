package cursoDioJava.algoritmos;

public class ClasseMediaAula1 {
	public static void main(String[] args) {
		// algoritmo média aritmética 4 notas
		
		String aluno = "Rafael Morales de Lima Aluno Web Dio me";
		double nota1 = 4;
		double nota2 = 4;
		double nota3 = 4;
		double nota4 = 4;
		
		double mediaTotal = 0;
		
		System.out.println("Algoritmo de média aritmética com 4 notas");
		
		mediaTotal = (nota1 + nota2 + nota3 + nota4)/4;
		
		
		System.out.println("Nota 1 é : "+nota1);
		System.out.println("Nota 2 é : "+nota2);
		System.out.println("Nota 3 é : "+nota3);
		System.out.println("Nota 4 é : "+nota4);
		
		System.out.println("Aluno " +aluno+ " Sua média é : "  +mediaTotal);
		
		if (mediaTotal >= 7 & mediaTotal <= 9) {
			
			System.out.println("Ótima nota... " +mediaTotal);
			System.out.println("Você esta aprovado");
		}else if(mediaTotal == 10) {
			
			System.out.println("Excelente nota... " +mediaTotal);
			System.out.println("Você esta aprovado");
		}
		
		else if (mediaTotal >= 5) {
			System.out.println("Sua nota não foi boa... " +mediaTotal);
			System.out.println("Você esta em exame");
		
		} else {
			
			System.out.println("Deu ruim ... " +mediaTotal);
			System.out.println("Você esta reprovado");
		}
		
		
	}

}
