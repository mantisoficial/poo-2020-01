public class novoLivro {
    
    private int ano;
    private String titulo;
    private Editora editora;
    private Pessoa autor;
    
    public Livro(String titulo, Editora editora, Pessoa autor, int ano){
        
        setAno(ano);
        setTitulo(titulo);
        setEditora(editora);
        setAutor(autor);
        
    }

    public int getAno() { 
        return ano;   
    }
    public void setAno(int ano) {  
        this.ano = ano;    
    }

    public Pessoa getAutor() {   
        return autor;  
    }
    public void setAutor(Pessoa autor) {    
        this.autor = autor;   
    }

    public Editora getEditora() {
        return editora;   
    }
    public void setEditora(Editora editora) {  
        this.editora = editora;   
    }

    public String getTitulo() {   
        return titulo; 
    }
    public void setTitulo(String titulo) {   
        this.titulo = titulo;   
    }
    
    @Override
    public String toString() {
        
        return getTitulo() + "\n" + getAutor().toString() + "\n" + getEditora().getNome() + ", " + getAno() + "\n" + getEditora().getLocal();
        
    }
    
}