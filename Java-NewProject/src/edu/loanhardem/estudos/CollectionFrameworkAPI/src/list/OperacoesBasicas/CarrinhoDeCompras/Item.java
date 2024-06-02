package list.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    private String nomeDoItem;
    private double precoDoItem;
    private int quantidadeDoItem;

    public String getNomeDoItem() {
        return nomeDoItem;
    }
    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public double getPrecoDoItem() {
        return precoDoItem;
    }
    public void setPrecoDoItem(double precoDoItem) {
        this.precoDoItem = precoDoItem;
    }

    public int getQuantidadeDoItem() {
        return quantidadeDoItem;
    }
    public void setQuantidadeDoItem(int quantidadeDoItem) {
        this.quantidadeDoItem = quantidadeDoItem;
    }

    public Item(String nomeDoItem, double precoDoItem, int quantidadeDoItem) {
        this.nomeDoItem = nomeDoItem;
        this.precoDoItem = precoDoItem;
        this.quantidadeDoItem = quantidadeDoItem;
    }
    @Override
    public String toString() {
        return "Item [Item: " + nomeDoItem + ", preco: " + precoDoItem + ", quantidade: "
                + quantidadeDoItem + "]";
    }

    
}
