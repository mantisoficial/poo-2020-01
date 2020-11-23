public class ExibeAnimal implements Operacao {

    @Override
    public void executa(Object obj) {
        SomAnimal animal = (SomAnimal) obj;
        System.out.println(((SomAnimal)obj).som());
    }
}