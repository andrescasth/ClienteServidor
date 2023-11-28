/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclienteservidor;

/**
 *
 * @author andre
 */
public class Actividades {
    private String actividad;
    private String excursiones;
    private String detalles;
    private String horarios;
    private double costo;

    public Actividades() {
    }

    public Actividades(String actividad, String excursiones, String detalles, String horarios, double costo) {
        this.actividad = actividad;
        this.excursiones = excursiones;
        this.detalles = detalles;
        this.horarios = horarios;
        this.costo = costo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(String excursiones) {
        this.excursiones = excursiones;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
