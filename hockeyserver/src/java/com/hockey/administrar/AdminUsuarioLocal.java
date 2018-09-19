/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hockey.administrar;

import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author PC_Angelo
 */
@Local
public interface AdminUsuarioLocal {
    public Integer registrarUsuario(String nomUsuario, Date fechaRegistro);
    public void registrarPuntaje(String nomUsuario, Date fechaRegistro, int puntaje);
}
