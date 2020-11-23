public class TesteLivroPessoaEditora {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Guilherme Faleiros", 2000);
        Editora editora = new Editora("Guilherme Faleiros", "Rua F-9, Qd 38, Lt 23, St Faiçalville");
        NewLivro livro = new NewLivro("Any Code", editora, pessoa, 2020);

        System.out.println(livro);
    }
}