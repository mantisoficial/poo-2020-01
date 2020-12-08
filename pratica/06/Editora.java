package pratica.06;

public class Editora {
    private String nome;
    private String local;

    public Editora(String nome, String local) {
        setNome(nome);
        setLocal(local);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + "\n" + getLocal();
    }    
}
