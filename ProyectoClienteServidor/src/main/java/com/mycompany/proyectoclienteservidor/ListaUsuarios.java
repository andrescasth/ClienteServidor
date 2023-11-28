/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclienteservidor;


import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class ListaUsuarios {
    
    ArrayList lista = new ArrayList<Usuario>();
     private static ListaUsuarios instancia = new ListaUsuarios();

    public ListaUsuarios() {
    }

    public ArrayList<Usuario> getLista() {
        return lista;
    }
    
    public static ListaUsuarios getInstancia() {
        return instancia;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
    public void agregarUsuario(Usuario usuario) {
        lista.add(usuario);
    }

    @Override
    public String toString() {
        return "" + lista + "";
    }
    
}
