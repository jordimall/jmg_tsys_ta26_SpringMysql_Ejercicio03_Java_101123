/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;

	/**
	 * Deveuelve todos los productos
	 * 
	 * @return List<Producto>
	 */
	@GetMapping("/all")
	public List<Producto> all() {
		return productoServiceImpl.getAll();
	}

	/**
	 * Devuelve un producto en especifico
	 * 
	 * @param id
	 * @return Producto
	 */
	@GetMapping("/show/{id}")
	public Producto show(@PathVariable(name = "id") Long id) {

		Producto producto_xid = new Producto();

		producto_xid = productoServiceImpl.getId(id);

		return producto_xid;
	}

	/**
	 * Añade un producto a la base de datos
	 * 
	 * @param producto
	 * @return Producto
	 */
	@PostMapping("/new")
	public Producto create(@RequestBody Producto producto) {

		return productoServiceImpl.add(producto);
	}

	/**
	 * Actualiza un producto
	 * 
	 * @param producto
	 * @return Producto
	 */
	@PutMapping("/update/{id}")
	public Producto edit(@PathVariable(name = "id") Long id, @RequestBody Producto producto) {

		Producto productoSeleccionado = new Producto();
		Producto productoActualizado = new Producto();

		productoSeleccionado = productoServiceImpl.getId(id);

		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());

		productoActualizado = productoServiceImpl.update(productoSeleccionado);

		return productoActualizado;
	}

	/**
	 * Elimina un producto
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		productoServiceImpl.delete(id);
	}

}