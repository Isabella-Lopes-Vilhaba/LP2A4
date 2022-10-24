package lp2a4.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudante")
public class Estudante {
	
	@Id
	@Column(nullable = false)
	private String matricula;
	
	@Column(nullable = false)
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String endereco;
	
	@Column(name="data_ingresso")
	private LocalDate dataIngresso;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	@Override
	public String toString() {
		return "Estudante [matricula=" + matricula + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", dataIngresso=" + dataIngresso + "]";
	}
}
