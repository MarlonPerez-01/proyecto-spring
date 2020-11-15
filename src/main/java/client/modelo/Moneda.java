package client.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="MONEDA")
public class Moneda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_moneda")
	private Long idMoneda;
	
	@Column(name="divisa")
	private String divisa;
	
	@Column(name="abreviatura")
	private String abreviatura;
	
	@JsonProperty("simbolo")
	private String simbolo;
	
	@Column(name="pais")
	private String pais;
	
	
	public Moneda() {
		
		
	}
	
	public Moneda(Long idMoneda, String divisa, String abreviatura, String simbolo, String pais) {
		
		this.idMoneda = idMoneda;
		this.divisa = divisa;
		this.abreviatura = abreviatura;
		this.simbolo = simbolo;
		this.pais = pais;
	}

	public Long getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(Long idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public String getAbreviatura() {
		return abreviatura;
	}
	
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

}
