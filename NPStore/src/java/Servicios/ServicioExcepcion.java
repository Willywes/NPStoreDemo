/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import javax.ejb.ApplicationException;
/**
 *
 * @author marti
 */
@ApplicationException(rollback = true)

public class ServicioExcepcion extends Exception {
    public ServicioExcepcion(String mensaje) {
        super(mensaje);
    }

}
