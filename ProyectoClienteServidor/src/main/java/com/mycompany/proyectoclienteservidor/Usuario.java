/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclienteservidor;

/**
 *
 * @author andre
 */
public class Usuario extends Admin{
    
   private String preferenciaContacto;

    public Usuario() {
 
    }

    public Usuario(String correo, String password) {
        super(correo, password);
    }
    

    public Usuario(String preferenciaContacto, String nombre, String apellido, String correo, String password) {
        super(nombre, apellido, correo, password);
        
        this.preferenciaContacto = preferenciaContacto;
    }

    public String getPreferenciaContacto() {
        return preferenciaContacto;
    }

    public void setPreferenciaContacto(String preferenciaContacto) {
        this.preferenciaContacto = preferenciaContacto;
    }
    
   
    
          
    
}
