/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class CompraColeccion {
    
    private static ArrayList<Compra> lista;

    public CompraColeccion() {
        lista = new ArrayList<Compra>();
    }

    //agregar
    public static void agregarStock(Compra compra) {
        lista.add(compra);
    }

    // listar
    public ArrayList<Compra> getLista() {
        return lista;
    }

    // eliminar
    public static boolean eliminarStock(int id) {
        for (Compra compra : lista) {
            if (compra.getId()== id) {
                lista.remove(compra);
                return true;
            }
        }
        return false;
    }

    
}
