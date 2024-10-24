/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Clase que representa un Pago realizado en Genes Store
public class Pago {
    // Atributos privados que definen las propiedades de la clase Pago
    private int id;
    private Pedido pedido;
    private double montoTotal;
    private String metodoPago;
    private String estado;

    // Constructor de la clase Pago para inicializar los atributos
    public Pago(int id, Pedido pedido, double montoTotal, String metodoPago, String estado) {
        this.id = id;
        this.pedido = pedido;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    // Método Getter para obtener valores de los atributos
    public String getEstado() {
        return estado;
    }
    
    // Método para procesar un Pago
    public void procesarPago() {
        if (metodoPago != null) {
            this.estado = "Procesado";
            // Habría que tener una lógica propia de la tienda Genes Store
        }
    }
}
