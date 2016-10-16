/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Willywes
 */
public class ClienteColeccion implements Serializable {

    private static ArrayList<Cliente> lista;

    public ClienteColeccion() {
        lista = new ArrayList<Cliente>();
    }

    //agregar
    public static void agregarCliente(Cliente cliente) {
        lista.add(cliente);
    }

    // listar
    public ArrayList<Cliente> getLista() {
        return lista;
    }

    // eliminar
    public static boolean eliminarCliente(int rut) {
        for (Cliente cliente : lista) {
            if (cliente.getRut() == rut) {
                lista.remove(cliente);
                return true;
            }
        }
        return false;
    }

    // buscar
    public static Cliente buscarCliente(int rut) {
        for (Cliente cliente : lista) {
            if (cliente.getRut() == rut) {

                return cliente;
            }
        }
        return null;
    }

    public static boolean comprobarRutRepetido(int rut) {
        for (Cliente cliente : lista) {
            if (cliente.getRut() == rut) {
                return true;
            }
        }
        return false;

    }

}
