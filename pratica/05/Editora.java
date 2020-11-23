public class Editora {
    private String nome;
    private String endereco;

    public Editora(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

    public String getEndereco() {
        return local;
    }

    public void setEndereco(String endereco{
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + "\n" + getEndereco();
    }
}