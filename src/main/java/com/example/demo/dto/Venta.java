/**
 * 
 */
package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "Producto")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "Cajero")
	private Cajero cajero;

	@ManyToOne
	@JoinColumn(name = "Maquina")
	private MaquinaRegistradora maqinaRegistradora;

	/**
	 * 
	 */
	public Venta() {
	}

	/**
	 * @param producto
	 * @param cajero
	 * @param maqinaRegistradora
	 */
	public Venta(Producto producto, Cajero cajero, MaquinaRegistradora maqinaRegistradora) {
		this.producto = producto;
		this.cajero = cajero;
		this.maqinaRegistradora = maqinaRegistradora;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 * @return the maqinaRegistradora
	 */
	public MaquinaRegistradora getMaqinaRegistradora() {
		return maqinaRegistradora;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	/**
	 * @param maqinaRegistradora the maqinaRegistradora to set
	 */
	public void setMaqinaRegistradora(MaquinaRegistradora maqinaRegistradora) {
		this.maqinaRegistradora = maqinaRegistradora;
	}

}
