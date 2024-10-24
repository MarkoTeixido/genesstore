/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Clase que representa a un Administrador de Genes Store y que hereda de la clase Usuario
public class Administrador extends Usuario {
    // Atributo adicional privado que forma parte de las propiedades de la clase Administrador
    private String rol;

    // Constructor que inicializa los atributos de Usuario y el rol específico del Administrador
    public Administrador(int id, String nombre, String email, String direccion, String contraseña, String metodoPago, String rol) {
        super(id, nombre, email, direccion, contraseña, metodoPago);
        this.rol = rol;
    }

    // Método para gestionar productos
    public void gestionarProducto(Producto producto) {
        // Lógica necesaria para gestionar los productos
    }

    // Método para gestionar usuarios
    public void gestionarUsuario(Usuario usuario) {
        // Lógica necesaria para gestionar los usuarios
    }
}
