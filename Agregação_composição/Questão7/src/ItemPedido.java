public class ItemPedido extends Pedido {
    private String nomeProduto;
    private int quantidade;
    private double preco;

    public ItemPedido(String nomeProduto, int quantidade, double preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double getSubtotal(){
       return this.quantidade * this.preco;
    }
}
