package cursoDioJava.algoritmos;

public class ClasseMediaAula1 {
	public static void main(String[] args) {
		// algoritmo m�dia aritm�tica 4 notas
		
		String aluno = "Rafael Morales de Lima Aluno Web Dio me";
		double nota1 = 5;
		double nota2 = 7;
		double nota3 = 10;
		double nota4 = 3;
		
		double mediaTotal = 0;
		
		System.out.println("Algoritmo de m�dia aritm�tica com 4 notas");
		
		mediaTotal = (nota1 + nota2 + nota3 + nota4)/4;
		
		
		System.out.println("Nota 1 � : "+nota1);
		System.out.println("Nota 2 � : "+nota2);
		System.out.println("Nota 3 � : "+nota3);
		System.out.println("Nota 4 � : "+nota4);
		
		System.out.println("Aluno " +aluno+ " Sua m�dia � : "  +mediaTotal);
		
		
	}

}
