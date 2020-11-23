public class TestaAnimais {
    public static void main(String[] args) {
        int i;
        TestaAnimais[] testaAnimais = new TestaAnimais[3];

        testaAnimais[0] = new Sapo();
        testaAnimais[1] = new Cachorro();
        testaAnimais[2] = new Boi();

        for (i = 0; i < 3; i++) {
            System.out.println(testaAnimais[i].som());
        }
}