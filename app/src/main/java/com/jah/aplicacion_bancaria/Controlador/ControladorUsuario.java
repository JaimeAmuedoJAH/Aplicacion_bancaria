package com.jah.aplicacion_bancaria.Controlador;

import com.jah.aplicacion_bancaria.Modelo.Cuenta;
import com.jah.aplicacion_bancaria.Modelo.Usuario;

public class ControladorUsuario {

    private static Usuario usuario;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        ControladorUsuario.usuario = usuario;
    }

    public static void cargarUsuario(){
        usuario = new Usuario("Jaime Amuedo", 012345, "Usuario1234", new Cuenta("ES16 0000 0000 0000 0000 0000", 0000, 0.0), 634000000, "pacopacopaco@gmail.com");
    }
}
