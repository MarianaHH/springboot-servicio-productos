package com.mariana.springboot.app.productos.models.service;

import java.util.List;

import com.mariana.springboot.app.commons.models.entity.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void deleteById(Long id);
	

}
