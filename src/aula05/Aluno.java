package aula05;

//classe DNA
//objetivo: Definir a estrutura
public class Aluno {
    public int id;
    public String nome;
    public String matricula;
    public int idade;

    // Declarando explicitamente o metodo construtor vazio
    // Contrutor cria objeto e executa o codigo do bloco
    public Aluno(){
        System.out.println("chamou o contrutor vazio!");
    }

    public Aluno(String nome){
        this.nome = nome;//this é pra acessar na raíz da classe
    }

    public Aluno(int id, String nome, String matricula, int idade){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }


    // assinatura:
    // proteção + reorno + nome + parâmetros
    public void imprimirDados(){
        
        System.out.println("\nID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Idade: " + idade);
    }
    // sobrecarga de métodos = repetição de mesma assinatura
    // mudando somente o parâmetro
    public void imprimirDados(int ordem){// é o parâmetro, se não tivesse daria erro, pois tem 2 iguais, tem que ter assinatura distinta
        System.out.println("\nAluno: " + ordem);
        imprimirDados();
    }
    
    
}
