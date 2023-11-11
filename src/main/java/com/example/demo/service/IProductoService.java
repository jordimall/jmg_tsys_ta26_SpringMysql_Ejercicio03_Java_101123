/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Producto;

/**
 * 
 */
public interface IProductoService {

	/**
	 * Deveuelve todos los productos
	 * 
	 * @return List<Producto>
	 */
	public List<Producto> getAll();

	/**
	 * Devuelve un producto en especifico
	 * 
	 * @param id
	 * @return Producto
	 */
	public Producto getId(Long id);

	/**
	 * Añade un producto a la base de datos
	 * 
	 * @param producto
	 * @return Producto
	 */
	public Producto add(Producto producto);

	/**
	 * Actualiza un producto
	 * 
	 * @param producto
	 * @return Producto
	 */
	public Producto update(Producto producto);

	/**
	 * Elimina un producto
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
