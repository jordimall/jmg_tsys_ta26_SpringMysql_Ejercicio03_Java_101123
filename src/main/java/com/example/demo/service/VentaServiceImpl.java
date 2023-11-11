/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

/**
 * 
 */
@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDAO daoVenta;

	/**
	 * Deveuelve todas las ventas
	 * 
	 * @return List<Venta>
	 */
	public List<Venta> getAll() {
		return daoVenta.findAll();
	}

	/**
	 * Devuelve una venta en especifico
	 * 
	 * @param id
	 * @return Venta
	 */
	public Venta getId(Long id) {
		return daoVenta.findById(id).get();
	}

	/**
	 * Añade una venta a la base de datos
	 * 
	 * @param venta
	 * @return Venta
	 */
	public Venta add(Venta venta) {
		return daoVenta.save(venta);
	}

	/**
	 * Actualiza una venta
	 * 
	 * @param venta
	 * @return Venta
	 */
	public Venta update(Venta venta) {
		return daoVenta.save(venta);
	}

	/**
	 * Elimina una venta
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoVenta.deleteById(id);
	}
}
