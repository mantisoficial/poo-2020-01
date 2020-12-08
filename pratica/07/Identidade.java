public class Identidade {
    private String numero;
    private String dataExpedicao;
    private String local;
    private String orgaoExpedidor;
    
    public Identidade(String numero, String dataExpedicao, String local, String orgaoExpedidor) {
        setNumero(numero);
        setDataExpedicao(dataExpedicao);
        setLocal(local);
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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
        + "\nLocal: " + getLocal()
        + "\nÓrgão Expedidor: " + getOrgaoExpedidor();
    }
}
