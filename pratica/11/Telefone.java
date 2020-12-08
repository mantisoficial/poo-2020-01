package pratica.11;

public class Telefone {
    private String numero;

    public Telefone(String numero) {
        setNumero(numero);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return getNumero();
    }
    
}
