package com.jah.aplicacion_bancaria.Modelo;

public class Usuario {

    private String usuario;
    private int contrasenhaInicio;
    private String contrasenhaTransaccion;
    private Cuenta cuentaBanco;
    private int numTelefono;
    private String correo;

    public Usuario(){}

    public Usuario(String usuario, int contrasenhaInicio, String contrasenhaTransaccion, Cuenta cuentaBanco, int numTelefono, String correo) {
        this.usuario = usuario;
        this.contrasenhaInicio = contrasenhaInicio;
        this.contrasenhaTransaccion = contrasenhaTransaccion;
        this.cuentaBanco = cuentaBanco;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContrasenhaInicio() {
        return contrasenhaInicio;
    }

    public void setContrasenhaInicio(int contrasenhaInicio) {
        this.contrasenhaInicio = contrasenhaInicio;
    }

    public String getContrasenhaTransaccion() {
        return contrasenhaTransaccion;
    }

    public void setContrasenhaTransaccion(String contrasenhaTransaccion) {
        this.contrasenhaTransaccion = contrasenhaTransaccion;
    }

    public Cuenta getCuentaBanco() {
        return cuentaBanco;
    }

    public void setCuentaBanco(Cuenta cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contrasenhaInicio=" + contrasenhaInicio +
                ", contrasenhaTransaccion='" + contrasenhaTransaccion + '\'' +
                ", cuentaBanco=" + cuentaBanco +
                ", numTelefono=" + numTelefono +
                ", correo='" + correo + '\'' +
                '}';
    }
}
