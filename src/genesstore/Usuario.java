/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesstore;

// Clase que representa un Usuario de Genes Store
public class Usuario {
    // Atributos protegidos que definen las propiedades de la clase Usuario (Accesibles en clases derivadas)
    protected int id;
    protected String nombre;
    protected String email;
    protected String direccion;
    protected String contraseña;
    protected String metodoPago;

    // Constructor de la clase Usuario para inicializar los atributos
    public Usuario(int id, String nombre, String email, String direccion, String contraseña, String metodoPago) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.metodoPago = metodoPago;
    }

    // Método para autenticar al usuario verificando email y contraseña
    public boolean autenticar(String email, String contraseña) {
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }
    
}