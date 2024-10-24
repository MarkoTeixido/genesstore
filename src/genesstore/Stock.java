/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Clase que representa el Stock de un Producto de Genes Store
public class Stock {
    // Atributos privados que definen las propiedades de la clase Stock
    private Producto producto;
    private int cantidadDisponible;

    // Constructor de la clase Usuario para inicializar los atributos
    public Stock(Producto producto, int cantidadDisponible) {
        this.producto = producto;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método para validar si hay Stock disponible para una cantidad solicitada
    public boolean validarDisponibilidad(int cantidad) {
        return cantidadDisponible >= cantidad;
    }

    // Método para actualizar el stock después de una venta
    public void actualizarStock(int cantidadVendida) {
        this.cantidadDisponible -= cantidadVendida;
    }
}
