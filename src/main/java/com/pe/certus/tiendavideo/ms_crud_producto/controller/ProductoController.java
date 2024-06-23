package com.pe.certus.tiendavideo.ms_crud_producto.controller;

import com.pe.certus.tiendavideo.ms_crud_producto.entity.Producto;
import com.pe.certus.tiendavideo.ms_crud_producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-products")
public class ProductoController {
    @Autowired
    ProductoService productoService;
    @PostMapping(value = "/Producto")
    public ResponseEntity saveUserData(@RequestBody Producto producto){
        try {
            productoService.saveUserData(producto);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping(value = "/listadoProductos")
    public ResponseEntity<List<Producto>> getUserData(){
        try {
            return new ResponseEntity<>(productoService.getUserData(),HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @PutMapping(value = "/user")
    public ResponseEntity updateUserData(@RequestBody Producto producto){
        try {
            productoService.updateUserData(producto);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @DeleteMapping(value = "/deleteProduct")
    public ResponseEntity deleteProducto(@RequestParam(value = "userId") Integer userId){
        try {
            productoService.deleteUserData(userId);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }



}
