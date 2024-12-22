package com.jah.aplicacion_bancaria.Modelo;

public class Cuenta {

    private String numCuenta;
    private int contrasenhaPago;
    private double dinero;

    public Cuenta(){}

    public Cuenta(String numCuenta, int contrasenhaPago, double dinero) {
        this.numCuenta = numCuenta;
        this.contrasenhaPago = contrasenhaPago;
        this.dinero = dinero;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getContrasenhaPago() {
        return contrasenhaPago;
    }

    public void setContrasenhaPago(int contrasenhaPago) {
        this.contrasenhaPago = contrasenhaPago;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", contrasenhaPago=" + contrasenhaPago +
                ", dinero=" + dinero +
                '}';
    }
}
