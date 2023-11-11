/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Venta;

/**
 * 
 */
public interface IVentaService {

	/**
	 * Deveuelve todas las ventas
	 * 
	 * @return List<Venta>
	 */
	public List<Venta> getAll();

	/**
	 * Devuelve una venta en especifico
	 * 
	 * @param id
	 * @return Venta
	 */
	public Venta getId(Long id);

	/**
	 * Añade una venta a la base de datos
	 * 
	 * @param venta
	 * @return Venta
	 */
	public Venta add(Venta venta);

	/**
	 * Actualiza una venta
	 * 
	 * @param venta
	 * @return Venta
	 */
	public Venta update(Venta venta);

	/**
	 * Elimina una venta
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
