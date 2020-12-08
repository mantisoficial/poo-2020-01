package pratica.10;

public class TestaAnimal {
    public static void main(String[] args) {
        Animal gato = new Animal("gato");
        Animal vaca = new Animal("vaca");
        Animal pato = new Animal("pato");
        Animal sapo = new Animal("sapo");
        Animal rato = new Animal("rato");
        Animal galo = new Animal("galo");

        // Gato não possui amigos neste ponto.
        System.out.println(gato);

        // Adiciona amigos para gato
        gato.adicionaAmigo(vaca);
        gato.adicionaAmigo(pato);
        gato.adicionaAmigo(sapo);
        gato.adicionaAmigo(rato);
        gato.adicionaAmigo(galo);

        System.out.println("Amigos de gato: " + gato.amigosAnimal());

        System.out.println("Amigos de rato: " + rato.amigosAnimal());

        rato.removeAmigo(gato);
       
        System.out.println("Amigos de gato: " + gato.amigosAnimal());
        System.out.println("Amgos de rato: " + rato.amigosAnimal());
    }
    
}
