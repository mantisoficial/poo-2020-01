public class Cpf {
    private String numero;
    private String dataExpedicao;

    public Cpf(String numero, String dataExpedicao) {
        setNumero(numero);
        setDataExpedicao(dataExpedicao);
    }

    public String getNumero() {
        return numero;
    };

    public void setNumero(String numero) {
        this.numero = numero;
    };

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    };

    public String toString() {
        return "\nCPF: " + getNumero()
        + "\nData de expedição: " + getDataExpedicao();
    }
}
