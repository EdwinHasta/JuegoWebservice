/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hockey.server;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC_Angelo
 */
@WebService(serviceName = "hockeyserver")
public class hockeyserver {

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
        //TODO write your implementation code here:
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
        //TODO write your implementation code here:
        return null;
    }
}
