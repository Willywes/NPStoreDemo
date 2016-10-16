/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author marti
 */
public class Compra {
    
    private int id;
    private Date fecha;
    private int rCliente;

    public Compra(int id, Date fecha, int rCliente) {
        this.id = id;
        this.fecha = fecha;
        this.rCliente = rCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getRCliente() {
        return rCliente;
    }

    public void setRCliente(int rCliente) {
        this.rCliente = rCliente;
    }
    
    
}
