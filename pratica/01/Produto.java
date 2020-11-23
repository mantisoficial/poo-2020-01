public class Produto {

    String descricao;
    float preco;
    float aliquota;
    Scanner print = new Scanner(System.in);

    public void getProduto() {

        System.out.print("Descrição: ");
        descricao = print.nextLine();
        System.out.print("Preço: ");
        preco = print.nextFloat();
        System.out.print("Aliquota: ");
        aliquota = print.nextFloat();

    }

}
