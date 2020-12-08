package pratica.11;

import java.util.*;

public class Pessoa {
    private String nome;
    private Set telefones = new HashSet();

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaTelefone(Telefone t) {
        telefones.add(t);
    }

    public void removeTelefone(Telefone t) {
        telefones.remove(t);
    }

    public String toString() {
        return getNome() + " telefones: " + telefones.toString();
    }
    
}
