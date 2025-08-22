package aula1508encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    //Códigos boiler plate (codigos repetitivos padronizados)
    //Usa string pq é o retorno que queremos, não void
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }

    //set é inserir
    public void setNome(String nome){
        this.nome = nome;
    }

    //Acessar por método ajuda em aplicar regras!
    public void setIdade(int idade){
        if(idade<0){
            System.out.println("Valor inválido!");
            //return; (usa para não usar else, já q volta pra cima)
        } else{
            this.idade = idade;
        }
    }

}