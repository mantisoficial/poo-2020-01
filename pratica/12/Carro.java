package pratica.12;

public class Carro {
    private String placa;

    public Carro(String placa) {
        setPlaca(placa);
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return getPlaca();
    }
}
