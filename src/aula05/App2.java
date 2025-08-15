package aula05;

public class App2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Goku");
        Aluno aluno2 = new Aluno(10, "Stefany", "202310070022", 16);
        aluno2.nome = "Mandibu";
        Aluno aluno3 = new Aluno();

        aluno1.imprimirDados();
        aluno2.imprimirDados();
        aluno3.imprimirDados();

    }
    
}
