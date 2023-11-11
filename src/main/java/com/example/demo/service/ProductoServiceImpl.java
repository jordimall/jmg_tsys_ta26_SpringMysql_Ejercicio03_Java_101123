/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;

/**
 * 
 */
@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO daoProducto;

	/**
	 * Deveuelve todos los productos
	 * 
	 * @return List<Producto>
	 */
	public List<Producto> getAll() {
		return daoProducto.findAll();
	}

	/**
	 * Devuelve un producto en especifico
	 * 
	 * @param id
	 * @return Producto
	 */
	public Producto getId(Long id) {
		return daoProducto.findById(id).get();
	}

	/**
	 * Añade un producto a la base de datos
	 * 
	 * @param producto
	 * @return Producto
	 */
	public Producto add(Producto producto) {
		return daoProducto.save(producto);
	}

	/**
	 * Actualiza un producto
	 * 
	 * @param producto
	 * @return Producto
	 */
	public Producto update(Producto producto) {
		return daoProducto.save(producto);
	}

	/**
	 * Elimina un producto
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoProducto.deleteById(id);
	}
}
