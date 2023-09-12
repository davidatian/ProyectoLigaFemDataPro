package com.mycompany.proyectoliga.controller;




/**
 *
 * @author Enciso Suarez
 */
public class AdministradorOpciones {

    // Metodo encargado de realizar la validacion de usuario y contraseña
    public void validarDatos(String usuario, String contrasena, String USERNAME, String PASSWORD) {
        if (usuario.equals(USERNAME) && contrasena.equals(PASSWORD)) {
            System.out.println("Acceso correcto");
            imprimirMenuPrincipal();
        } else {
            System.out.println("Datos incorrectos");
        }

    }

    public boolean validarDatosUsuario(String usuario, String contrasena, String USERNAME, String PASSWORD) {
        if (usuario.equals(USERNAME) && contrasena.equals(PASSWORD)) {
            return true;
        } else {
            return  false;
        }
    }

    // Imprime el menu de opciones disponibles al usuario
    public void imprimirMenuPrincipal() {
    }

    
}