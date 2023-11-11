/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.MaquinaRegistradora;

/**
 * 
 */
public interface IMaquinaRegistradoraService {

	/**
	 * Deveuelve todos las maquinasRegistradoras
	 * 
	 * @return List<MaquinaRegistradora>
	 */
	public List<MaquinaRegistradora> getAll();

	/**
	 * Devuelve una maquinasRegistradora en especifico
	 * 
	 * @param id
	 * @return MaquinaRegistradora
	 */
	public MaquinaRegistradora getId(Long id);

	/**
	 * Añade uan maquinasRegistradora a la base de datos
	 * 
	 * @param maquinasRegistradora
	 * @return MaquinaRegistradora
	 */
	public MaquinaRegistradora add(MaquinaRegistradora maquinasRegistradora);

	/**
	 * Actualiza una maquinasRegistradora
	 * 
	 * @param maquinasRegistradora
	 * @return MaquinaRegistradora
	 */
	public MaquinaRegistradora update(MaquinaRegistradora maquinasRegistradora);

	/**
	 * Elimina una maquinasRegistradoras
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
