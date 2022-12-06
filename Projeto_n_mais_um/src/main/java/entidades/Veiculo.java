package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Veiculo
 *
 */
@Entity

public class Veiculo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column 
	private int id;
	
	@Column
	private String fabricante;
	
	@Column
	private String modelo;
	
	@Column
	private int ano_fabricacao;
	
	@Column
	private int ano_modelo;
	
	@Column
	private String tipo_combustivel;
	
	@ManyToOne
	@JoinColumn(name = "codigo_proprietario")
	private Proprietario proprietario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno_fabricacao() {
		return ano_fabricacao;
	}

	public void setAno_fabricacao(int ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
	}

	public int getAno_modelo() {
		return ano_modelo;
	}

	public void setAno_modelo(int ano_modelo) {
		this.ano_modelo = ano_modelo;
	}

	public String getTipo_combustivel() {
		return tipo_combustivel;
	}

	public void setTipo_combustivel(String tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ano_fabricacao="
				+ ano_fabricacao + ", ano_modelo=" + ano_modelo + ", tipo_combustivel=" + tipo_combustivel
				+ ", proprietario=" + proprietario + "]";
	}
   
}
