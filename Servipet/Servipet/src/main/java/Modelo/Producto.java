package Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
 @Entity
public class Producto {

    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Lob
    private byte[] ImagenProducto;

    private String NombreProducto;

    private String DescripcionProducto;

    private int PrecioProducto;

    private short CantidadProducto;

    private byte Estado;
}
