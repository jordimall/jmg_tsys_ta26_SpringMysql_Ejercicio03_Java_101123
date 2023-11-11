/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

/**
 * 
 */
@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO daoCajero;

	/**
	 * Deveuelve todos los cajeos
	 * 
	 * @return List<Cajero>
	 */
	public List<Cajero> getAll() {
		return daoCajero.findAll();
	}

	/**
	 * Devuelve un cajeo en especifico
	 * 
	 * @param id
	 * @return Cajero
	 */
	public Cajero getId(Long id) {
		return daoCajero.findById(id).get();
	}

	/**
	 * Añade un cajeo a la base de datos
	 * 
	 * @param cajeo
	 * @return Cajero
	 */
	public Cajero add(Cajero cajeo) {
		return daoCajero.save(cajeo);
	}

	/**
	 * Actualiza un cajeo
	 * 
	 * @param cajeo
	 * @return Cajero
	 */
	public Cajero update(Cajero cajeo) {
		return daoCajero.save(cajeo);
	}

	/**
	 * Elimina un cajeo
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoCajero.deleteById(id);
	}
}
