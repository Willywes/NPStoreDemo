/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author marti
 */
public interface GenerarCRUD <Algo>{ // algo = a un objeto cualqueira
    
    public void create(Algo a);
    public Algo read(Object clave);
    public void update(Algo a);
    public void delete(Object clave);
    public List<Algo> readAll();
    
}
