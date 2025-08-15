package aula4;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um valor para exibir a tabuada: ");
    int valor = teclado.nextInt();

    //inputs da repetição:
    //valor inicial
    //condição de parada
    //incremento
   
    int i = 1;
    System.out.println("\n COM WHILE: \n");
    while(i <= 10){
        System.out.println(i + " X " + valor + " = " + (i*valor));
        i++;
    }
    System.out.println("\n COM FOR: \n ");
    for(i=1; i<=10; i++) {
        System.out.println(i + " X " + valor + " = " + (i*valor));
    }
}
}
