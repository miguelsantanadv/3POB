package aluno;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	       
		Scanner sc = new Scanner(System.in);
	        
	    System.out.println("Informe o nome:");
	    String nome = sc.nextLine();
	    
	    System.out.println("Informe a matrícula:");
	    String matricula =sc.nextLine();
	        
	    System.out.println("Informe a idade:");
	    int idade = sc.nextInt();
	        
	    System.out.println("Informe o email:");
	    String email = sc.next();  
	        
	    sc.close();
	        
	    Alunos aluno1 = new Alunos(nome, matricula, idade, email);
	    aluno1.exibirInformacoes();
	        
	}
}
	