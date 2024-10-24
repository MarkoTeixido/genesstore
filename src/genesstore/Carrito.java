/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Importaciones básicas para el funcionamiento de nuestro código
import java.util.ArrayList;
import java.util.List;

// Clase que representa un Carrito de compras en Genes Store
public class Carrito {
    // Atributos privados que definen las propiedades de la clase Carrito
    private Usuario usuario;
    private List<Producto> productos;
    private double precioTotal;

    // Constructor de la clase Carrito para inicializar los atributos
    public Carrito(Usuario usuario) {
        this.usuario = usuario;
        this.productos = new ArrayList<>();
        this.precioTotal = 0;
    }

    // Métodos Getters para obtener valores de los atributos
    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
    
    // Método para agregar un producto al Carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        calcularPrecioTotal();
    }

    // Método para eliminar un producto del carrito
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        calcularPrecioTotal();
    }
    
    // Método privado para calcular el precio total de los productos en el carrito
    private void calcularPrecioTotal() {
        precioTotal = 0;
        for(Producto producto : productos) {  // Recorre la lista de productos
            precioTotal += producto.getPrecio();  // Suma el precio de cada producto
        }
    }
}
