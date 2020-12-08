public class Passaporte {
    private String numero;
    private String dataExpedicao;
    private String validade;
    private String orgaoExpedidor;
    
    public Passaporte(String numero, String dataExpedicao, String validade, String orgaoExpedidor) {
        setNumero(numero);
        setDataExpedicao(dataExpedicao);
        setValidade(validade);
        setOrgaoExpedidor(orgaoExpedidor);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String toString() {
        return "\nRG: " + getNumero()
        + "\nData de expedição: " + getDataExpedicao()
        + "\nLocal: " + getValidade()
        + "\nÓrgão Expedidor: " + getOrgaoExpedidor();
    }
}
    
