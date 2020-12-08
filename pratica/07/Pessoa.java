package pratica.07;

import java.util.Date;

public class Pessoa {
    // XXX Tipos mais adequados podem ser empregados
    private String corOlhos;
    private String corPele;
    private String corCabelo;
    private float peso;
    private float altura;
    private Date dataNascimento;
    private String localNascimento;
    private String nome;
    private String cpf;
    private String idt;
    private String passaporte;
    private String nomeMae;
    private String nomePai;
    private Endereco endereco;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Endereco endereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    


    public String toString() {
        return "Nome: " + ((getNome() == null) ? "NF" : getNome())
               + "\nPai: " + ((getNomePai() == null) ? "NF" : getNomePai())
               + "\nMae: " + ((getNomeMae() == null) ? "NF" : getNomeMae())
               + "\nCpf: " + ((getCpf() == null) ? "NF" : getCpf())
               + "\nIdentidade: " + ((getIdt() == null) ? "NF" : getIdt())
               + "\nPassaporte: " + ((getPassaporte() == null) ? "NF" : getPassaporte())
               + "\nData de nascimento: " + ((getDataNascimento() == null) ? "NF" : getDataNascimento());
    }
    
}
