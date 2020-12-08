package pratica.09;

import java.util.*;

public class CD {
    private String nome;
    private Date dataLancamento;
    private ArrayList cantores = new ArrayList();

    public CD(String nome, Date dl, Pessoa cantor) {
        setNome(nome);
        setDataLancamento(dl);
        adicionaCantor(cantor);
    }

    public void adicionaCantor(Pessoa p) {
        cantores.add(p);
    }

    public Pessoa removeCantor(int ordem) {
        return (Pessoa)(cantores.remove(ordem));
    }

    public String toString() {
        String saida = "CD: " + nome + "\nCantores:\n";
        for (int i = 0; i < cantores.size(); i++) {
            saida += cantores.get(i).toString() + "\n";
        }
        return saida;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
