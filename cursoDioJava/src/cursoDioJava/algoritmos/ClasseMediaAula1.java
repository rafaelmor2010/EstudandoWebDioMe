package cursoDioJava.algoritmos;

public class ClasseMediaAula1 {
	public static void main(String[] args) {
		// algoritmo m�dia aritm�tica 4 notas
		
		String aluno = "Rafael Morales de Lima Aluno Web Dio me";
		double nota1 = 4;
		double nota2 = 4;
		double nota3 = 4;
		double nota4 = 4;
		
		double mediaTotal = 0;
		
		System.out.println("Algoritmo de m�dia aritm�tica com 4 notas");
		
		mediaTotal = (nota1 + nota2 + nota3 + nota4)/4;
		
		
		System.out.println("Nota 1 � : "+nota1);
		System.out.println("Nota 2 � : "+nota2);
		System.out.println("Nota 3 � : "+nota3);
		System.out.println("Nota 4 � : "+nota4);
		
		System.out.println("Aluno " +aluno+ " Sua m�dia � : "  +mediaTotal);
		
		if (mediaTotal >= 7 & mediaTotal <= 9) {
			
			System.out.println("�tima nota... " +mediaTotal);
			System.out.println("Voc� esta aprovado");
		}else if(mediaTotal == 10) {
			
			System.out.println("Excelente nota... " +mediaTotal);
			System.out.println("Voc� esta aprovado");
		}
		
		else if (mediaTotal >= 5) {
			System.out.println("Sua nota n�o foi boa... " +mediaTotal);
			System.out.println("Voc� esta em exame");
		
		} else {
			
			System.out.println("Deu ruim ... " +mediaTotal);
			System.out.println("Voc� esta reprovado");
		}
		
		
	}

}
