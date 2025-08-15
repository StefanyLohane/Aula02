package aula05;

public class App {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(); //New vai na estrutura aluno e reserva um espaço com toda a estrutura na memória RAM
        Aluno aluno2 = new Aluno(); //Aluno1 é uma caixa que tem 4 caixinhas
        Aluno aluno3 = new Aluno();

        aluno1.id = 10;
        aluno1.nome = "Stefany Lohane";
        aluno1.matricula = "202310070022";
        aluno1.idade = 16;
        
        aluno2.id = 11;
        aluno2.nome = "Maria Paula";
        aluno2.matricula = "202310070016";
        aluno2.idade = 17;

        aluno3.id = 12;
        aluno3.nome = "Johana";
        aluno3.matricula = "202310070023";
        aluno3.idade = 18;

        Aluno aluno4=aluno3;
        Aluno aluno5=aluno3;

        // imprimir dados
        aluno1.imprimirDados(1); // parênteses é ara criar um método, chave é para criar blocos
        aluno2.imprimirDados(2);
        aluno3.imprimirDados(3);
        

    }
    
}
