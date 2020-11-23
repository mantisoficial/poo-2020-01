public class ItemNotaFiscal {
    Produto produto = new Produto();
    int quantidade;
    float precoFinal;

    public ItemNotaFiscal(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public float getTotal() {
        float precoComImposto = produto.getPreco() * (1 + produto.getAliquota());
        precoFinal = quantidade * precoComImposto;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}