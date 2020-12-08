package pratica.06;

import java.util.Date;

public class TestaEmprestimo {
    public static void main(String[] args) {

        Editora editora = new Editora("Editora A", "Rua T-63");
        Pessoa autor = new Pessoa("Arthur Moura", 2001);
        Livro l = new Livro("Fábulas",editora,autor,2004);

        
        Pessoa func = new Pessoa("Pedro", 1999);
        Pessoa usr = new Pessoa("Hugo",1985);
        Emprestimo emp = new Emprestimo(l,func,usr, new Date());

        
        System.out.println(emp);
    }
}
