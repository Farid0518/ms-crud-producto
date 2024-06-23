package com.pe.certus.tiendavideo.ms_crud_producto.service;

import com.pe.certus.tiendavideo.ms_crud_producto.entity.Producto;

import java.util.List;

public interface ProductoService {
    Producto saveUserData(Producto producto);
    List<Producto> getUserData();
    Producto updateUserData(Producto userEntity);
    void deleteUserData(Integer id);
}
