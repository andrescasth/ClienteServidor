/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclienteservidor;

/**
 *
 * @author andre
 */
public class Alojamiento {
    
    private String pais;
   private String ciudad;
   private double precio;
   private String cantidad;

    public Alojamiento() {
    }

    public Alojamiento(String pais, String ciudad, double precio, String cantidad) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    
    }
   
   

