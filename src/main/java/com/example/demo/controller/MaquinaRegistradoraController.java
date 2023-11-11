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

import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.service.MaquinaRegistradoraServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/maquinaRegistradoras")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;

	/**
	 * Deveuelve todas las maquinaRegistradoras
	 * 
	 * @return List<MaquinaRegistradora>
	 */
	@GetMapping("/all")
	public List<MaquinaRegistradora> all() {
		return maquinaRegistradoraServiceImpl.getAll();
	}

	/**
	 * Devuelve una maquinaRegistradora en especifico
	 * 
	 * @param id
	 * @return MaquinaRegistradora
	 */
	@GetMapping("/show/{id}")
	public MaquinaRegistradora show(@PathVariable(name = "id") Long id) {

		MaquinaRegistradora maquinaRegistradora_xid = new MaquinaRegistradora();

		maquinaRegistradora_xid = maquinaRegistradoraServiceImpl.getId(id);

		return maquinaRegistradora_xid;
	}

	/**
	 * Añade una maquinaRegistradora a la base de datos
	 * 
	 * @param maquinaRegistradora
	 * @return MaquinaRegistradora
	 */
	@PostMapping("/new")
	public MaquinaRegistradora create(@RequestBody MaquinaRegistradora maquinaRegistradora) {

		return maquinaRegistradoraServiceImpl.add(maquinaRegistradora);
	}

	/**
	 * Actualiza una maquinaRegistradora
	 * 
	 * @param maquinaRegistradora
	 * @return MaquinaRegistradora
	 */
	@PutMapping("/update/{id}")
	public MaquinaRegistradora edit(@PathVariable(name = "id") Long id,
			@RequestBody MaquinaRegistradora maquinaRegistradora) {

		MaquinaRegistradora maquinaRegistradoraSeleccionado = new MaquinaRegistradora();
		MaquinaRegistradora maquinaRegistradoraActualizado = new MaquinaRegistradora();

		maquinaRegistradoraSeleccionado = maquinaRegistradoraServiceImpl.getId(id);

		maquinaRegistradoraSeleccionado.setPiso(maquinaRegistradora.getPiso());

		maquinaRegistradoraActualizado = maquinaRegistradoraServiceImpl.update(maquinaRegistradoraSeleccionado);

		return maquinaRegistradoraActualizado;
	}

	/**
	 * Elimina una maquinaRegistradora
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		maquinaRegistradoraServiceImpl.delete(id);
	}

}
