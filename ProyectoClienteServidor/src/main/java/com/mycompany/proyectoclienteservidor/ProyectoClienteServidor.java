/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoclienteservidor;

import InterfazProyecto.Home;
import InterfazProyecto.TipoUsuario;
import InterfazProyecto.UsuarioAdmin;
import InterfazProyecto.UsuarioRegular;
/**
 *
 * @author andre
 */
public class ProyectoClienteServidor {

    public static void main(String[] args) {
       TipoUsuario tipoUsuario = new TipoUsuario();
       tipoUsuario.setVisible(true);  
        tipoUsuario.pack();
        tipoUsuario.setLocationRelativeTo(null);//Centra la ventana
       
       
    }

    
}
