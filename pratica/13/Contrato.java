package pratica.13;

import java.util.*;

public class Contrato {
    private Date inicio;
    private Date fim;
    
    Contrato(Date inicio, Date fim, Calendar calendario) {
        setInicio(inicio);
        setFim(fim);
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public String toString() {
        return "\nInício do contrato: " + getInicio().toString()
        + "\nFim do contrato: " + getFim().toString();
    }
}
