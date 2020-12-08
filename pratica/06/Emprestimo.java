package pratica.06;

import java.util.Date;

public class Emprestimo {
    private Livro obra;
    private Pessoa funcionario;
    private Pessoa usuario;
    private Date data;

    public Emprestimo(Livro obra, Pessoa func, Pessoa usuario, Date data) {
        setObra(obra);
        setFuncionario(func);
        setUsuario(usuario);
        setData(data);
    }

    public String toString() {
        return "Livro emprestado: " + obra.toString() + "\n"
               + "Funcionario: " + funcionario.getNome() + "\n"
               + "Usuario: " + usuario.getNome() + "\n"
               + "Data: " + getData().toString();
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Livro getObra() {
        return obra;
    }

    public void setObra(Livro obra) {
        this.obra = obra;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
