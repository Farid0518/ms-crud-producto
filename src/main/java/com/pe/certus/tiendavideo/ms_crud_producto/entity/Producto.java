package com.pe.certus.tiendavideo.ms_crud_producto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @Column(name = "IDPRODUCTO")
    private Integer idProducto;
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "COSTO_UNITARIO_SOL")
    private Double costoUnitarioSol;
    @Column(name = "PRODUCTO_DISPONIBLE")
    private Integer productoDisponible;


}
