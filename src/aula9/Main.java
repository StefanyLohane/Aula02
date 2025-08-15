package aula9;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jonh Doe";
        aluno1.idade = 50;

        Matricula mat = new Matricula();
        mat.status = "Matriculado";
        mat.codigo = "20250001002";
        mat.data = LocalDateTime.now(); // Now não personaliza a data, of modifica.
        mat.aluno = aluno1;

        //fazer tudo começando da classe que ele pediu!!

        System.out.println("Dados Matrícula");
        System.out.println("Aluno: " + mat.aluno.nome);
        System.out.println("Idade: " + mat.aluno.idade);
        System.out.println("Matrícula: " + mat.codigo);
        System.out.println("Status: " + mat.status);
        System.out.println("Data: " + mat.data); //pega o do horário

    }
}
