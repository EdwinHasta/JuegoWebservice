/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hockey.server;

import com.hockey.administrar.AdminRecursoLocal;
import com.hockey.administrar.AdminUsuarioLocal;
import com.hockey.entidades.Recurso;
import java.util.Date;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC_Angelo
 */
@WebService(serviceName = "hockeyserver")
public class hockeyserver {

    @EJB
    AdminUsuarioLocal adminUsuario;
    @EJB
    AdminRecursoLocal adminRecurso;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarUsuario")
    public String registrarUsuario(@WebParam(name = "nomUsuario") String nomUsuario, @WebParam(name = "fechaRegistro") Date fechaRegistro) {
        adminUsuario.registrarUsuario(nomUsuario, fechaRegistro);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "reiniciarJuego")
    public String reiniciarJuego() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarPuntaje")
    public String registrarPuntaje(@WebParam(name = "nomUsuario") String nomUsuario, @WebParam(name = "fechaRegistro") Date fechaRegistro, @WebParam(name = "puntaje") int puntaje) {
        //TODO write your implementation code here:
        return null;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarDireccion")
    public String cambiarDireccion(@WebParam(name = "posX") String posX, @WebParam(name = "posY") String posY, @WebParam(name = "posZ") String posZ) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPosicionPelota")
    public String consultarPosicionPelota(@WebParam(name = "idPelota") String idPelota) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarPosicionJugador")
    public String modificarPosicionJugador(@WebParam(name = "idUsuario") String idUsuario, @WebParam(name = "posX") int posX, @WebParam(name = "posY") int posY, @WebParam(name = "posZ") int posZ) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerTablero")
    public String obtenerTablero() {
        Recurso recurso = adminRecurso.consultarRecurso("FONDO");
        return recurso.getUrl();
    }
    
    @WebMethod(operationName = "obtenerDecorador1")
    public String obtenerDecorador1() {
        Recurso recurso = adminRecurso.consultarRecurso("DECORADOR1");
        return recurso.getUrl();
    }
    
    @WebMethod(operationName = "obtenerDecorador2")
    public String obtenerDecorador2() {
        Recurso recurso = adminRecurso.consultarRecurso("DECORADOR2");
        return recurso.getUrl();
    }
    
    @WebMethod(operationName = "obtenerComplemento")
    public String obtenerComplemento() {
        Recurso recurso = adminRecurso.consultarRecurso("LESS");
        return recurso.getUrl();
    }
}
