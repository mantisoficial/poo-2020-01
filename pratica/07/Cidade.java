public class Cidade {
    private String nome;
    private String estado;
    private int ddd;

    public Cidade(String nome, String estado, int ddd) {
        setNome(nome);
        setEstado(estado);
        setDdd(ddd);
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDdd(){
        return ddd;
    }
    
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String toString() {
        return "\nCidade: " + getNome()
        + "\nEstado: " + getEstado()
        + "\nDDD: " + getDdd();
    }

}

