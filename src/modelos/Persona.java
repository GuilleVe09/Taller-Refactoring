/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *
 * @author User
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected Direccion direccion;
    protected Telefono telefono;
    protected List<Paralelo> paralelos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public List<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(List<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
   
}
