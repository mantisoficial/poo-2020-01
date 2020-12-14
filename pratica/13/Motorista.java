package pratica.13;

public class Motorista {
    private String nome;
    private String codigo;
    private TipoHabilitacao tipoHabilitacao;
    private Contrato contrato;

    public Motorista(String nome, String codigo, TipoHabilitacao tipoHabilitacao, Contrato contrato) {
        setNome(nome);
        setCodigo(codigo);
        setTipoHabilitacao(tipoHabilitacao);
        setContrato(contrato);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoHabilitacao getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public void setTipoHabilitacao(TipoHabilitacao tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public String toString() {
        return getNome() + " (" + getCodigo() + ")"
        + "\nTipo de Habilitação: " + getTipoHabilitacao()
        + getContrato().toString();
    }
}
