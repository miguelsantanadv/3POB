package aluno;
import java.util.Scanner;

public class Alunos {
    private String nome;
    private String matricula;
    private int idade;
    private String email;
    Scanner scanner = new Scanner(System.in);
    
    public Alunos(String nome, String matricula, int idade, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.email= email;
    }
    
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getEmail() {
        return email;
    }

	public void exibirInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Matrícula: " + matricula);
	        System.out.println("Idade: " + idade);
	        System.out.println("Email: " + email);  
	}  
}   