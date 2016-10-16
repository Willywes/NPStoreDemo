/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author marti
 */
public class Stock implements Serializable {
    private int cantidad;
    private int produId;

    public Stock(int cantidad, int produId) {
        this.cantidad = cantidad;
        this.produId = produId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProduId() {
        return produId;
    }

    public void setProduId(int produId) {
        this.produId = produId;
    }
}
