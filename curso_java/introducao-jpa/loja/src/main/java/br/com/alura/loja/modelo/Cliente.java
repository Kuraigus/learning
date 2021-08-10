package br.com.alura.loja.modelo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Embedded
	private DadosPessoais dados;
	
	public Cliente() {};
	
	public Cliente(String nome, String cpf) {
		dados = new DadosPessoais(nome, cpf);
	}

	public String getNome() {
		return this.dados.getNome();
	}

	public String getCpf() {
		return this.dados.getCpf();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DadosPessoais getDados() {
		return dados;
	}



}
