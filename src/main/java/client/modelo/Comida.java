package client.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="Comida")
public class Comida {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long idComida;
	@Column(name="descripcion")
	private String descomida;
	@Column(name="fecha_produccion")
	private String fechalot;
	@Column(name="fecha_vencimiento")
	private String fec_v;
	@Column(name="Marca")
	private String Marca_com;
	@Column(name="cantidad")
	private int can;
	

public Comida()
{
	
}
public Comida(Long idcomida, String descomida,String fechalot,String fec_v,String Marca_com,int can) 
{
	this.idComida= idcomida;
	this.descomida=descomida;
	this.fechalot=fechalot;
	this.fec_v=fec_v;
	this.Marca_com=Marca_com;
	this.can=can;
}


public Long getIdComida() {
	return idComida;
}
public void setIdComida(Long idComida) {
	this.idComida = idComida;
}
public String getDescomida() {
	return descomida;
}
public void setDescomida(String descomida) {
	this.descomida = descomida;
}
public String getFechalot() {
	return fechalot;
}
public void setFechalot(String fechalot) {
	this.fechalot = fechalot;
}
public String getFec_v() {
	return fec_v;
}
public void setFec_v(String fec_v) {
	this.fec_v = fec_v;
}
public String getMarca_com() {
	return Marca_com;
}
public void setMarca_com(String marca_com) {
	Marca_com = marca_com;
}
public int getCan() {
	return can;
}
public void setCan(int can) {
	this.can = can;
}
}