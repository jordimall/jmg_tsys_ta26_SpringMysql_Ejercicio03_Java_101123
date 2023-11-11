/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaRegistradoraDAO;
import com.example.demo.dto.MaquinaRegistradora;

/**
 * 
 */
@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService {

	@Autowired
	IMaquinaRegistradoraDAO daoMaquinaRegistradora;

	/**
	 * Deveuelve todas las maquinaRegistradoras
	 * 
	 * @return List<MaquinaRegistradora>
	 */
	public List<MaquinaRegistradora> getAll() {
		return daoMaquinaRegistradora.findAll();
	}

	/**
	 * Devuelve una maquinaRegistradora en especifico
	 * 
	 * @param id
	 * @return MaquinaRegistradora
	 */
	public MaquinaRegistradora getId(Long id) {
		return daoMaquinaRegistradora.findById(id).get();
	}

	/**
	 * Añade una maquinaRegistradora a la base de datos
	 * 
	 * @param maquinaRegistradora
	 * @return MaquinaRegistradora
	 */
	public MaquinaRegistradora add(MaquinaRegistradora maquinaRegistradora) {
		return daoMaquinaRegistradora.save(maquinaRegistradora);
	}

	/**
	 * Actualiza una maquinaRegistradora
	 * 
	 * @param maquinaRegistradora
	 * @return MaquinaRegistradora
	 */
	public MaquinaRegistradora update(MaquinaRegistradora maquinaRegistradora) {
		return daoMaquinaRegistradora.save(maquinaRegistradora);
	}

	/**
	 * Elimina una maquinaRegistradora
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoMaquinaRegistradora.deleteById(id);
	}
}
