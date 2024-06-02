package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nomeDoItem, double precoDoItem, int quantidadeDoItem){
        carrinhoDeCompras.add(new Item(nomeDoItem, precoDoItem, quantidadeDoItem));
    }

    public void removerItem(int indice){
        if (indice >= 0 && indice < this.carrinhoDeCompras.size()) {
            this.carrinhoDeCompras.remove(indice);
        }
    }

    public void removerItemPeloNome(String nomeDoItem){
        for(Item item : this.carrinhoDeCompras){
            if (item.getNomeDoItem().equalsIgnoreCase(nomeDoItem)) {
                this.carrinhoDeCompras.remove(item);
            }
            return;
        }
    }

    public double calculaValorTotal(){
        double total = 0.0;
        for(Item item : this.carrinhoDeCompras){
            total += item.getPrecoDoItem() * item.getQuantidadeDoItem();
        }

        return total;
    }

    public void exibirItem(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 30.79, 1);
        carrinho.adicionarItem("feijao", 22.0, 1);
        carrinho.adicionarItem("carne", 40.99, 1);
        carrinho.adicionarItem("ovo", 8.46, 3);
        carrinho.exibirItem();
        System.out.println("Valor a pagar: " + carrinho.calculaValorTotal());
        
        carrinho.removerItem(0);

        carrinho.exibirItem();
        System.out.println("Valor a pagar: " + carrinho.calculaValorTotal());

        carrinho.removerItemPeloNome("feijao");

        
        carrinho.exibirItem();
        System.out.println("Valor a pagar: " + carrinho.calculaValorTotal());

    }

}
