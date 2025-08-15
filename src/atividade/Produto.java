package atividade;

public class Produto {
    // Atributos/variáveis
    public int id;
    public String nome;
    public String descricao;
    public String codigoBarras;
    public double valor;

    // Declarando o método construtor vazio
    // Contrutor cria objeto e executa o codigo do bloco

    public Produto(){
    }

    public Produto(int id, String nome, String descricao, String codigoBarras, double valor){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    // assinatura:
    // proteção + reorno + nome + parâmetros

    public void imprimirDados(){
        
        System.out.println("\nID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Código de  barras: " + codigoBarras);
        System.out.println("Valor: " + valor);
    }
}
