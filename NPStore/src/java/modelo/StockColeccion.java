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
public class StockColeccion {
    
    private static ArrayList<Stock> lista;

    public StockColeccion() {
        lista = new ArrayList<Stock>();
    }

    //agregar
    public static void agregarStock(Stock stock) {
        lista.add(stock);
    }

    // listar
    public ArrayList<Stock> getLista() {
        return lista;
    }

    // eliminar
    public static boolean eliminarStock(int cantidad) {
        for (Stock stock : lista) {
            if (stock.getCantidad()== cantidad) {
                lista.remove(stock);
                return true;
            }
        }
        return false;
    }

    
}
