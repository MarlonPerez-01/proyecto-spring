package client.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="contratosV2")
public class Contrato {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contrato")
	private Long id_contrato;
	
	
	@Column(name="fecha_inicio")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fecha_inicio;
	
	
	@Column(name="fecha_finalizacion")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fecha_finalizacion;
	
	@Column(name="nombre_empleado")
	private String nombre_empleado;
	
	@Column(name="apellido_empleado")
	private String apellido_empleado;
	
	@Column(name="dui")
	private int dui;
	
	
	public Contrato() {
		
		
	}
	
	public Contrato(Long id_contrato, Date fecha_inicio,Date fecha_finalizacion,String nombre_empleado,String apellido_empleado,int dui) 
	{
		this.id_contrato = id_contrato;
		this.fecha_inicio = fecha_inicio;
		this.fecha_finalizacion = fecha_finalizacion;
		this.nombre_empleado = nombre_empleado;
		this.apellido_empleado = apellido_empleado;
		this.dui = dui;
	
	}

	public Long getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_finalizacion() {
		return fecha_finalizacion;
	}

	public void setFecha_finalizacion(Date fecha_finalizacion) {
		this.fecha_finalizacion = fecha_finalizacion;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public String getApellido_empleado() {
		return apellido_empleado;
	}

	public void setApellido_empleado(String apellido_empleado) {
		this.apellido_empleado = apellido_empleado;
	}

	public int getDui() {
		return dui;
	}

	public void setDui(int dui) {
		this.dui = dui;
	}
	
}