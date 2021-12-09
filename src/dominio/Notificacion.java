/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Equipo 6
 */
public class Notificacion {
    private Usuario usuario;
    private String mensaje;
    private Date fechaHora;

    public Notificacion() {
        
    }    
    
    public Notificacion(Usuario usuario, String mensaje, Date fechaHora) {
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
    }

    public Notificacion(Usuario usuario, Date fechaHora) {
        this.usuario = usuario;
        this.fechaHora = fechaHora;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
