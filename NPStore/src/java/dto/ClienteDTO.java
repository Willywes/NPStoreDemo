/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import dominio.*;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author marti
 */
public class ClienteDTO implements Serializable{
    
    private int rut;
    private String email;
    private String clave;
    private String nombre;
    private String apellido;
    private Date fNac;

    public ClienteDTO() {
    }

    public ClienteDTO(int rut, String email, String clave, String nombre, String apellido, Date fNac) {
        this.rut = rut;
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNac = fNac;
    }
    

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

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

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }
    
    

}
