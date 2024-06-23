package com.pe.certus.tiendavideo.ms_crud_producto.service;

import com.pe.certus.tiendavideo.ms_crud_producto.entity.Producto;
import com.pe.certus.tiendavideo.ms_crud_producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceimpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    @Override
    public Producto saveUserData(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> getUserData() {
        return productoRepository.findAll();
    }

    @Override
    public Producto updateUserData(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deleteUserData(Integer id) {
        productoRepository.deleteById(id);

    }
}
