package com.pe.certus.tiendavideo.ms_crud_producto.repository;

import com.pe.certus.tiendavideo.ms_crud_producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {


}
