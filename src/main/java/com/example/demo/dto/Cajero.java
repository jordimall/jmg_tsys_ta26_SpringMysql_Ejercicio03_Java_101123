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
@Table(name="cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Codigo")
	private Long codigo;
	
	@Column(name="nom_apels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "Cajero")
	private Set<Venta> venta;

	/**
	 * 
	 */
	public Cajero() {
	}

	/**
	 * @param nomApels
	 */
	public Cajero(String nomApels) {
		this.nomApels = nomApels;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @return the venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajero")
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
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(Set<Venta> venta) {
		this.venta = venta;
	}
	
	
}
