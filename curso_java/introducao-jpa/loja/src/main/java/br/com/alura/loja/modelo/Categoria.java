package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Categorias")
public class Categoria {

	@EmbeddedId
    private CategoriaId id;
    
    public Categoria() {}

    public Categoria(String nome, String tipo) {
        this.id = new CategoriaId(nome, tipo);
    }

    public String getNome() {
        return id.getNome();
    }
}
