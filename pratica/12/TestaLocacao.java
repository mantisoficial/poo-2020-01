package pratica.12;

import java.util.Calendar;

public class TestaLocacao {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Ze", "1");
        Carro c1 = new Carro("ZAZ 9999");

        /* Simula locação de 01/04/2004 até 05/04/2004
         * com quilometragem inicial 150 e final 490
         * Preco por dia: R$32,00
         * Preco por km: R$1,20
         */
        Locacao l1 = new Locacao(null, null, 0, 0, 0, 0, m1, c1, null);
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
