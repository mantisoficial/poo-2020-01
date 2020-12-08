package pratica.07;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Arthur");
        p.setNomeMae("Marilene");
        p.setNomePai("Paulo");
        p.setCpf("123.456.789-87");
        p.setidt("611156");
        p.setPassaporte("655696369");
        p.setDataNascimento("29/01/2001");

        Pessoa a = new Pessoa();
        p.setNome("Enzo");
        p.setNomeMae("Marilene");
        p.setNomePai("Paulo");
        p.setCpf("122.444.700-03");
        p.setidt("618050");
        p.setPassaporte("650016369");
        p.setDataNascimento("21/11/2002");

        System.out.println(p);
    }
}
