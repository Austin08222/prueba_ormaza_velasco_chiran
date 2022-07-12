/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import javax.swing.JOptionPane;
import ec.edu.intsuperior.modelo.Persona; 
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Aplicacion {
      public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Persona p1= new Persona();
         System.out.println("Ingese tu cedula");
        p1.setCi(leer.next());
        System.out.println("Ingresa tu primer nombre");
        p1.setApellido1(leer.next());
        System.out.println("Ingresa tu segundo nombre");
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa tu segundo nombre"));
        System.out.println("Ingesa tu primer apellido");
        p1.setApellido1(JOptionPane.showInputDialog("Ingesa tu primer apellido"));
        System.out.println("Ingresa tu segundo apellido");
        p1.setApellidos2(leer.next());
        System.out.println("Ingresa tu direccion");
        p1.setDireccion(leer.next());
        System.out.println("Ingresa tu numero telefonico");
        p1.setCelular(leer.next());
        System.out.println("Ingresa tu correo electronico");
        p1.setCorreo(leer.next());
        System.out.println("Ingresa tu fecha de nacimeinto");
        
        
        
        JOptionPane.showMessageDialog(null,p1.toString());
        
    }
}
