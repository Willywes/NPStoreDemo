/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Willywes
 */
public class ProductoColeccion {
     private static ArrayList<Producto> lista;

    public ProductoColeccion() {
        lista = new ArrayList<Producto>();
    }

    //agregar
    public static void agregarProducto(Producto producto) {
        lista.add(producto);
    }

    // listar
    public ArrayList<Producto> getLista() {
        return lista;
    }

    // eliminar
    public static boolean eliminarProducto(int id) {
        for (Producto producto : lista) {
            if (producto.getId()== id) {
                lista.remove(producto);
                return true;
            }
        }
        return false;
    }

    // buscar
    public static Producto buscarProducto(int id) {
        for (Producto producto : lista) {
            if (producto.getId()== id) {

                return producto;
            }
        }
        return null;
    }

    public static boolean comprobarIdRepetido(int id) {
        for (Producto producto : lista) {
            if (producto.getId() == id) {
                return true;
            }
        }
        return false;

    }

}
