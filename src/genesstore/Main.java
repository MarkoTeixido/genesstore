/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Importaciones básicas para el funcionamiento de nuestro código
import java.util.ArrayList;
import java.util.List;

public class Main {
// Productos de Ejemplo para probar el código
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Productos de Ejemplo para probar el código
        Producto producto1 = new Producto(1, "remera Cliff", "remera de algodón", 1799.99, "M", "Rojo", 100);
        Producto producto2 = new Producto(2, "Jean Olko", "Jean Skinny", 1799.99, "32", "Azul", 50);

        // Usuario de Ejemplo para probar el código
        Usuario cliente = new Usuario(1, "John Doe", "johnDoe@mail.com", "Calle Nueva 123", "password", "Tarjeta");

        // Creación de Carrito y agregando productos con el método del objeto para probar el código
        Carrito carrito = new Carrito(cliente);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        // Mostrando el precio total del carrito para probar el código
        System.out.println("Precio total del carrito: $" + carrito.getPrecioTotal());

        // Pedido de Ejemplo para probar el código
        List<Producto> productosPedido = new ArrayList<>();
        productosPedido.add(producto1);
        productosPedido.add(producto2);
        Pedido pedido = new Pedido(1, cliente, productosPedido, "2024-10-24", carrito.getPrecioTotal(), "Pendiente");

        // Confirmación del pedido realizado
        pedido.confirmarPedido();
        System.out.println("Pedido confirmado.");
    }
    
}
