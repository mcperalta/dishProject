/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dish.models;
import javax.xml.bind.annotation.*;

/**
 *
 * @author cperalta
 */
@XmlRootElement
public class ResponseWS {
    private int     codigo;
    private String  mensaje;
    private Projects  payload;

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Projects getPayload() {
        return payload;
    }

    public void setPayload(Projects payload) {
        this.payload = payload;
    }
 
    
    public ResponseWS()
    {
        // costructor por defecto
        codigo      = 404;
        mensaje  = "Error no identificado";
      
    }
    public ResponseWS(int pcodigo, String pmensaje, Projects ppayload)
    {
        this.codigo      = pcodigo;
        this.mensaje  = pmensaje;
        this.payload    = ppayload;
    }
    public ResponseWS(int pcodigo, String pmensaje)
    {
        this.codigo      = pcodigo;
        this.mensaje  = pmensaje;
        
    }      
    @Override
    public String toString() {
        return new StringBuffer(" codigo: ").
                append(codigo).
                append(" mensaje: ").
                append(mensaje).
                append(" payload: ").
                append(payload).toString();
    }
}
