package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")

public class Producto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int idProducto;

@Column(name = "nombreProducto", length = 100)    
    private String nombreProducto;

@Column (name = "cantidadProductos")
    private int cantidadProducto;

    

    //Constructor vacío

    

}
