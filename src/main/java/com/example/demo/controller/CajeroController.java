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

import com.example.demo.dto.Cajero;
import com.example.demo.service.CajeroServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/cajeros")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;

	/**
	 * Deveuelve todos los cajeros
	 * 
	 * @return List<Cajero>
	 */
	@GetMapping("/all")
	public List<Cajero> all() {
		return cajeroServiceImpl.getAll();
	}

	/**
	 * Devuelve un cajero en especifico
	 * 
	 * @param id
	 * @return Cajero
	 */
	@GetMapping("/show/{id}")
	public Cajero show(@PathVariable(name = "id") Long id) {

		Cajero cajero_xid = new Cajero();

		cajero_xid = cajeroServiceImpl.getId(id);

		return cajero_xid;
	}

	/**
	 * Añade un cajero a la base de datos
	 * 
	 * @param cajero
	 * @return Cajero
	 */
	@PostMapping("/new")
	public Cajero create(@RequestBody Cajero cajero) {

		return cajeroServiceImpl.add(cajero);
	}

	/**
	 * Actualiza un cajero
	 * 
	 * @param cajero
	 * @return Cajero
	 */
	@PutMapping("/update/{id}")
	public Cajero edit(@PathVariable(name = "id") Long id, @RequestBody Cajero cajero) {

		Cajero cajeroSeleccionado = new Cajero();
		Cajero cajeroActualizado = new Cajero();

		cajeroSeleccionado = cajeroServiceImpl.getId(id);

		cajeroSeleccionado.setNomApels(cajero.getNomApels());

		cajeroActualizado = cajeroServiceImpl.update(cajeroSeleccionado);

		return cajeroActualizado;
	}

	/**
	 * Elimina un cajero
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		cajeroServiceImpl.delete(id);
	}

}
