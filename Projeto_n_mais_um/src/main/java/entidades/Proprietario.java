package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proprietario
 *
 */
@Entity

public class Proprietario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column 
	private int codigo;
	
	@Column 
	String nome;
   
	@Column 
	String email;

	@Column 
	String telefone;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Proprietario [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ "]";
	}
}
