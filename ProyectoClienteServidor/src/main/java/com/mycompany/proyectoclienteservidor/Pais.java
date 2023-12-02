/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclienteservidor;

/**
 *
 * @author andre
 */
public class Pais {
    private String ubicacion;
    private String tipoViaje;
    private double precio;
    private String fecha;

    public Pais() {
    }

    
    
    public Pais(String ubicacion, String tipoViaje, double precio, String fecha) {
        this.ubicacion = ubicacion;
        this.tipoViaje = tipoViaje;
        this.precio = precio;
        this.fecha= fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public double getPresupuesto() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
