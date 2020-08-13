package com.mariana.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.mariana.springboot.app.commons.models.entity.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Long> {

}
