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

import com.example.demo.dto.Venta;
import com.example.demo.service.VentaServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/ventas")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;

	/**
	 * Deveuelve todos los ventas
	 * 
	 * @return List<Venta>
	 */
	@GetMapping("/all")
	public List<Venta> all() {
		return ventaServiceImpl.getAll();
	}

	/**
	 * Devuelve un venta en especifico
	 * 
	 * @param id
	 * @return Venta
	 */
	@GetMapping("/show/{id}")
	public Venta show(@PathVariable(name = "id") Long id) {

		Venta venta_xid = new Venta();

		venta_xid = ventaServiceImpl.getId(id);

		return venta_xid;
	}

	/**
	 * Añade un venta a la base de datos
	 * 
	 * @param venta
	 * @return Venta
	 */
	@PostMapping("/new")
	public Venta create(@RequestBody Venta venta) {

		return ventaServiceImpl.add(venta);
	}

	/**
	 * Actualiza un venta
	 * 
	 * @param venta
	 * @return Venta
	 */
	@PutMapping("/update/{id}")
	public Venta edit(@PathVariable(name = "id") Long id, @RequestBody Venta venta) {

		Venta ventaSeleccionado = new Venta();
		Venta ventaActualizado = new Venta();

		ventaSeleccionado = ventaServiceImpl.getId(id);

		ventaSeleccionado.setCajero(venta.getCajero());
		ventaSeleccionado.setMaqinaRegistradora(venta.getMaqinaRegistradora());
		ventaSeleccionado.setProducto(venta.getProducto());

		ventaActualizado = ventaServiceImpl.update(ventaSeleccionado);

		return ventaActualizado;
	}

	/**
	 * Elimina un venta
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		ventaServiceImpl.delete(id);
	}

}