/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hockey.administrar;

import com.hockey.entidades.Recurso;
import javax.ejb.Local;

/**
 *
 * @author PC_Angelo
 */
@Local
public interface AdminRecursoLocal {
    public Recurso consultarRecurso(String nombre);
    
}
