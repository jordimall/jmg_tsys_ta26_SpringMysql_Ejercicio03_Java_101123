/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajero;

/**
 * 
 */
public interface ICajeroService {

	/**
	 * Deveuelve todos los cajeros
	 * 
	 * @return List<Cajero>
	 */
	public List<Cajero> getAll();

	/**
	 * Devuelve un cajero en especifico
	 * 
	 * @param id
	 * @return Cajero
	 */
	public Cajero getId(Long id);

	/**
	 * Añade un cajero a la base de datos
	 * 
	 * @param cajero
	 * @return Cajero
	 */
	public Cajero add(Cajero cajero);

	/**
	 * Actualiza un cajero
	 * 
	 * @param cajero
	 * @return Cajero
	 */
	public Cajero update(Cajero cajero);

	/**
	 * Elimina un cajero
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
