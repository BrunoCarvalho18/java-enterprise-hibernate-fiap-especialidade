package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tb_especialidade")
public class Especialidade {
	
	public Especialidade() {
		
	}
	
	public Especialidade(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	
	@Id
	@SequenceGenerator(name = "especialidade", sequenceName = "sq_tb_especialidade", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "especialidade")
	@Column(name = "id_especialidade")
	private int id;
	
	@Column(name="nm_especialidade")
	private String nome;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	

}
