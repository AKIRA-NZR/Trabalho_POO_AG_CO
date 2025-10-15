public class Main {
    public static void main(String[] args) throws Exception {
        Pedido ped1 = new Pedido();
        ped1.adicionar2Item("Mangá",2 ,19.90,"caderno",10,20.00);
        System.out.println("Valor total é: " + ped1.valorTotal());
    }
}
