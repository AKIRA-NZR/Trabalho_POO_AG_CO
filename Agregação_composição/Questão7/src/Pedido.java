import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido(){
        this.itens = new ArrayList<>();
    }
    public void adicionarUmItem(String produto, int quantidade , double preco){
        ItemPedido item = new ItemPedido(produto, quantidade, preco);
        this.itens.add(item);
    }
    public void adicionar2Item(String produto, int quantidade, double preco,String produto2, int quantidade2, double preco2){
        ItemPedido item1 = new ItemPedido(produto,quantidade,preco);
        ItemPedido item2 = new ItemPedido(produto2,quantidade2,preco2);
        this.itens.add(item1);
        this.itens.add(item2);
    }
    public double valorTotal(){
        double soma = 0.0;
        for(ItemPedido i: this.itens){
            soma += i.getSubtotal();
        }
        return soma;
    }
}
