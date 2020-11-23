import java.util.List;

public class NotaFiscal {
    private List<ItemNotaFiscal> itens;

    public NotaFiscal(List<ItemNotaFiscal> itens) {
        this.itens = itens;
    }

    public float getTotal() {
        float acumulador = 0.0f;
        for (ItemNotaFiscal item : itens) {
            acumulador += item.getTotal();
        }
        return acumulador;
    }

}