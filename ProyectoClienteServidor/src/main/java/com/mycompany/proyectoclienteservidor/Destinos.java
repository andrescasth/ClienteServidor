/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclienteservidor;

/**
 *
 * @author andre
 */
public class Destinos {
    private String ubicacion;
    private String tipoViaje;
    private double presupuesto;

    public Destinos() {
    }

    
    
    public Destinos(String ubicacion, String tipoViaje, double presupuesto) {
        this.ubicacion = ubicacion;
        this.tipoViaje = tipoViaje;
        this.presupuesto = presupuesto;
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
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
    
}
