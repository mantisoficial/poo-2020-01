package pratica.13;

import java.util.Calendar;

public class TestaLocacao {
    public static void main(String[] args) {
        TipoHabilitacao th = TipoHabilitacao.D;
        Contrato cr1 = new Contrato(null, null, null);
        Motorista m1 = new Motorista("Murilo Mesquita", "1", th, cr1);
        Categoria ca = Categoria.superLuxo;
        Tipo ti = Tipo.passeio;
        Carro c1 = new Carro("ZAZ 9999", ca, ti);
        Cliente cl1 = new Cliente("Rodrigo Calaça");
        Calendar c0 = Calendar.getInstance();
        c0.set(2009,10,19);
        cr1.setInicio(c0.getTime());
        c0.set(2020,10,19);
        cr1.setFim(c0.getTime());
        
        /* Simula locação de 01/04/2004 até 05/04/2004
         * com quilometragem inicial 150 e final 490
         * Preco por dia: R$32,00
         * Preco por km: R$1,20
         */

        Locacao l1 = new Locacao(null, null, 0, 0, 0, 0, m1, c1, null, cl1);
        Calendar c = Calendar.getInstance();
        c.set(2004,4,1);
        l1.setDataInicial(c.getTime());
        c.set(2004,4,5); // Quatro dias depois...
        l1.setDataFinal(c.getTime());
        l1.setKmInicial(150);
        l1.setKmFinal(490);
        l1.setPrecoDia(32);
        l1.setPrecoKm(1.2F);
        l1.setCarro(c1);
        l1.setMotorista(m1);

        // Emite detalhes de locação (inclusive custo)
        System.out.println(l1);
    }
}
