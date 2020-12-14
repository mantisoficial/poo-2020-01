package pratica.13;

public class Carro {
    private String placa;
    private Tipo tipo;
    private Categoria categoria;

    public Carro(String placa, Categoria categoria, Tipo tipo) {
        setPlaca(placa);
        setCategoria(categoria);
        setTipo(tipo);
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

    public String toString() {
        return getPlaca()
        + "\nTipo: " + getTipo()
        + "\nCategoria: " + getCategoria();
    }
}
