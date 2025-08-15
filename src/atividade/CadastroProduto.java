package atividade;

public class CadastroProduto {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.id = 10;
        produto1.nome = "Hambúrguer";
        produto1.descricao = "Hambúrguer duplo de frango";
        produto1.codigoBarras = "S009L45S4L";
        produto1.valor = 15.00;

        Produto produto2 = new Produto(11,"Subway", "Delicioso sanduíche cheio de molho", "S709L75S8L", 12.00);
        Produto produto3 = new Produto(12,"Misto Quente","Recheio derretido e saboroso","S109L21S7L", 14.00);

        System.out.println("\n====> Produto 1 <====");
        produto1.imprimirDados();
        
        System.out.println("\n====> Produto 2 <====");
        produto2.imprimirDados();

        System.out.println("\n====> Produto 3 <====");
        produto3.imprimirDados();
    }
}