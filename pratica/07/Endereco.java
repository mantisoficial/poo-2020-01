package pratica.07;

public class Endereco {
    
    private String rua;
    private String setor;
    private int numero;
    private int cep;

    public Endereco(String rua, String setor, int numero, int cep) {
        super();
        this.rua = rua;
        this.setor = setor;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int cep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
