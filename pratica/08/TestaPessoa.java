package pratica.08;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa h = new Pessoa("Joao da Silva");
        Pessoa m = new Pessoa("Maria de Jesus");

        System.out.println(h);
        System.out.println(m);

        m.setNome(h.getNome());

        System.out.println(h);
        System.out.println(m);
    }
    
}
