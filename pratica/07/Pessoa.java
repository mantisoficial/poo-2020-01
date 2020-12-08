public class Pessoa {
    private String nome;
    private String corOlhos;
    private String corPele;
    private String corCabelo;
    private float peso;
    private float altura;
    private String dataNascimento;
    private String nomePai;
    private String nomeMae;
    private Cidade cidade;
    private Cpf cpf;
    private Endereco endereco;
    private Identidade idt;
    private Passaporte passaporte;
    

    public Pessoa(String nome, String corOlhos, String corPelo, 
    String corCabelo, float peso, float altura,
    String dataNascimento, String nomePai, String nomeMae, 
    Cidade cidade, Cpf cpf, Endereco endereco, 
    Identidade idt, Passaporte passaporte) {

        setNome(nome);
        setCorOlhos(corOlhos);
        setCorPele(corPele);
        setCorCabelo(corCabelo);
        setPeso(peso);
        setAltura(altura);
        setDataNascimento(dataNascimento);
        setNomePai(nomePai);
        setNomeMae(nomeMae);
        setCidade(cidade);
        setCpf(cpf);
        setEndereco(endereco);
        setIdt(idt);
        setPassaporte(passaporte);
    }

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

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Identidade getIdt() {
        return idt;
    }

    public void setIdt(Identidade idt) {
        this.idt = idt;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
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
               + "\nCor dos olhos: " + ((getCorOlhos() == null) ? "NF" : getCorOlhos())
               + "\nCor de pele: " + ((getCorPele() == null) ? "NF" : getCorPele())
               + "\nCor do cabelo: " + ((getCorCabelo() == null) ? "NF" : getCorCabelo())
               + "\nPeso: " + getPeso()
               + "\nAltura: " + getAltura()
               + "\nPai: " + ((getNomePai() == null) ? "NF" : getNomePai())
               + "\nMae: " + ((getNomeMae() == null) ? "NF" : getNomeMae())
               + "\nData de nascimento: " + ((getDataNascimento() == null) ? "NF" : getDataNascimento())
               + "\nNome da mãe: " + ((getNomeMae() == null) ? "NF" : getNomeMae())
               + "\nNome do pai: " + ((getNomePai() == null) ? "NF" : getNomePai())
               + "\n\n" + cidade.toString()
               + "\n\n" + cpf.toString()
               + "\n\n" + endereco.toString()
               + "\n\n" + idt.toString()
               + "\n\n" + passaporte.toString();               
    }
    
}
