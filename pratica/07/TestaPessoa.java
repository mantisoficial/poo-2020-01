public class TestaPessoa {
    public static void main(String[] args) {

        Cidade c = new Cidade("Goiânia", "Goiás", 62);
        Cpf cp = new Cpf("123.456.799-02", "22/02/2004");
        Endereco e = new Endereco("Rua 1", "Setor Oeste", 05, 7789688);
        Identidade i = new Identidade("612363", "21/02/2004", "Goiânia", "SSP-GO");
        Passaporte pa = new Passaporte("889663963645", "17/02/2006", "17/02/2026", "SSP-GO");

        Pessoa p = new Pessoa(null, null, null, null, 0, 0, null, null, null, c, cp, e, i, pa);

        p.setNome("Arthur");
        p.setCorOlhos("Castanho");
        p.setCorPele("Branca");
        p.setCorCabelo("Preto");
        p.setPeso(71);
        p.setAltura(2);
        p.setNomeMae("Marilene");
        p.setNomePai("Paulo");
        p.setDataNascimento("20/01/2001");
       

        System.out.println(p);
        
    }
}
