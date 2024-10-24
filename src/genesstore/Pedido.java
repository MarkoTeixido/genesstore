/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Importación básica para el funcionamiento de nuestro código
import java.util.List;

// Clase que representa un Pedido realizado en Genes Store
public class Pedido {
    // Atributos privados que definen las propiedades de la clase Pedido
    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private String fecha;
    private double precioTotal;
    private String estado;

    // Constructor de la clase Pedido para inicializar los atributos
    public Pedido(int id, Usuario usuario, List<Producto> productos, String fecha, double precioTotal, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.productos = productos;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }
    
    // Métodos Getters para obtener valores de los atributos
    public List<Producto> getProductos() { 
        return productos; 
    }
    
    public String getEstado() { 
        return estado; 
    }

    // Método para confirmar el pedido
    public void confirmarPedido() {
        this.estado = "Confirmado";
        // // Habría que tener una lógica propia de la tienda Genes Store
    }
}
