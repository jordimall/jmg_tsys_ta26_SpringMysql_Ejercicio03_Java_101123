/**
 * 
 */
package com.example.demo.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private Long codigo;

	@Column(name = "Piso")
	private int piso;
	
	@OneToMany
	@JoinColumn(name="Maquina")
	private Set<Venta> venta;

	/**
	 * 
	 */
	public MaquinaRegistradora() {
	}

	/**
	 * @param piso
	 */
	public MaquinaRegistradora(int piso) {
		this.piso = piso;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @return the venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Maquina")
	public Set<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(Set<Venta> venta) {
		this.venta = venta;
	}
	
}
