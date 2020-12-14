package pratica.13;

import java.util.*;

public class Locacao {
    private Date dataInicial;
    private Date dataFinal;
    private int kmInicial;
    private int kmFinal;
    private float precoKm;
    private float precoDia;
    private Motorista motorista;
    private Carro carro;
    private Cliente cliente;

    public Locacao(Date dataInicial, Date dataFinal, int kmInicial, 
    int kmFinal, float precoKm, float precoDia,
    Motorista motorista, Carro carro, Calendar calendario, Cliente cliente) {
        setDataInicial(dataInicial);
        setDataFinal(dataFinal);
        setKmInicial(kmInicial);
        setKmFinal(kmFinal);
        setPrecoKm(precoKm);
        setPrecoDia(precoDia);
        setMotorista(motorista);
        setCarro(carro);
        setCliente(cliente);
    }

    public double obtemCusto() {
        // Obtém números de dias transcorridos
        long nDias = dataFinal.getTime() - dataInicial.getTime();
        nDias = nDias / (1000 * 60 * 60 * 24);

        return (kmFinal - kmInicial) * precoKm + nDias * precoDia;
    }

    public double custoTotal() {
        // Valores adicionais são calculados sobre preço base (pb)
        double pb = obtemCusto();
    
        double ca = 0.0; // Custo adicional
        ca = (carro.getCategoria().equals(Categoria.luxo)) ? 0.15 * pb : 0.0;
        ca = (carro.getCategoria().equals(Categoria.superLuxo)) ? 0.2 * pb : 0.0;
        ca = (carro.getTipo().equals(Tipo.utilitario)) ? 0.15 * pb : 0.0;
    
        // Antiguidade do motorista pode onerar em 5%.
        Calendar inicio = Calendar.getInstance();
        inicio.add(Calendar.YEAR, -5);
        ca = inicio.after(motorista.getContrato().getInicio()) ? 0.05 * pb : ca;
        return pb + ca;
    }


    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public float getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(float precoKm) {
        this.precoKm = precoKm;
    }

    public float getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(float precoDia) {
        this.precoDia = precoDia;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean compativel(Motorista m, Carro carro) {
        TipoHabilitacao hab = m.getTipoHabilitacao();
    
        // C ou D pode dirigir qualquer carro
        boolean retorno = hab.equals(TipoHabilitacao.C)
                || hab.equals(TipoHabilitacao.D);
    
        // Se não for C ou D, então apenas carro de passeio
        // poderá ser dirigido por carteira B
        if (!retorno) {
            retorno = hab.equals(TipoHabilitacao.B)
            && carro.getTipo().equals(Tipo.passeio);
        }
    
        return retorno;
    }

    public String toString() {
        String saida = "Motorista: ";
        saida += getMotorista().toString() + "\n";
        saida += "Habilitação compatível: " + compativel(motorista, carro);
        saida += "\nCliente: " + getCliente().toString() + "\n";
        saida += "\nCarro: " + getCarro().toString() + "\n";
        saida += "Quilometragem inicial: " + getKmInicial();
        saida += " final: " + getKmFinal() + "\n";
        saida += "Data locacao: " + getDataInicial().toString();
        saida += " entrega: " + getDataFinal().toString() + "\n";
        saida += "\nR$/km: " + getPrecoKm() + " R$/dia: " + getPrecoDia();
        saida += "\nCusto da locacao: " + custoTotal();

        return saida;
    }
}