/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Clase que representa un Producto de Genes Store
public class Producto {
    // Atributos privados que definen las propiedades de la clase Producto
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String talla;
    private String color;
    private int stock;

    // Constructor de la clase Producto para inicializar los atributos
    public Producto(int id, String nombre, String descripcion, double precio, String talla, String color, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.talla = talla;
        this.color = color;
        this.stock = stock;
    }

    // Métodos Getters y Setters para obtener o establecer valores de los atributos
    public int getId() { 
        return id; 
    }
    
    public String getNombre() { 
        return nombre; 
    }
    
    public String getDescripcion() {
        return descripcion; 
    }
    
    public double getPrecio() { 
        return precio; 
    }
    
    public String getTalla() { 
        return talla; 
    }
    
    public String getColor() { 
        return color; 
    }
    
    public int getStock() { 
        return stock; 
    }
    
    public void setStock(int stock) { 
        this.stock = stock; 
    }

    // Método que muestra los detalles básicos de un producto
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
}

