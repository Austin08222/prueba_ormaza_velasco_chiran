/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author jonat
 */
public class Persona {
    private String nombre1;
    private String nombre2;
    private String ci;
    private String apellido1;
    private String apellidos2;
    private String direccion;
    private String celular;
    private String correo;
    private Date fechadenacimiento;

    public Persona() {
    }

    public Persona(String nombre1, String nombre2, String ci, String apellido1, String apellidos2, String direccion, String celular, String correo, Date fechadenacimiento) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.ci = ci;
        this.apellido1 = apellido1;
        this.apellidos2 = apellidos2;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellidos2(String apellidos2) {
        this.apellidos2 = apellidos2;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechadeNacimiento(Date fechadecoumpleaños) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getCi() {
        return ci;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellidos2() {
        return apellidos2;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechadeNacimiento() {
        return fechadenacimiento;
    }
    public int calcularedad() {
        int edad= 19;
        
        return edad;
    }
        
        
    

    @Override
    public String toString() {
        return "Los datos del objeto son: \n"
                +"Ci: " + getCi() +"\n" 
                + "Apellidos y Nombre: "+getApellido1()+" "+getApellidos2()+ 
                " "+getNombre1()+" "+getNombre2()+"\n" 
                +"Direccion: "+getDireccion()+"\n" 
                + "celular: "+getCelular()+"\n" 
                + "correo: "+getCorreo()+"\n" 
                + "Edad: "+calcularedad();
            
                }
}
