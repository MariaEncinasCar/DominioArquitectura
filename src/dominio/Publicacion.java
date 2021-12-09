/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Image;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Equipo 6
 */
public class Publicacion {
    private Date fechaHora;
    private String contenidoTex;
    private Image contenidoImg;
    private List<Usuario> usuariosEtiquetados;
    private Usuario usuario;

    public Publicacion(Date fechaHora, String contenidoTex, Image contenidoImg,
            List<Usuario> usuariosEtiquetados, Usuario usuario) {
        this.fechaHora = fechaHora;
        this.contenidoTex = contenidoTex;
        this.contenidoImg = contenidoImg;
        this.usuariosEtiquetados = usuariosEtiquetados;
        this.usuario = usuario;
    }

    public Publicacion() {
    }

    public Publicacion(Date fechaHora, String contenidoTex, Image contenidoImg, Usuario usuario) {
        this.fechaHora = fechaHora;
        this.contenidoTex = contenidoTex;
        this.contenidoImg = contenidoImg;
        this.usuario = usuario;
    }
    
    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenidoTex() {
        return contenidoTex;
    }

    public void setContenidoTex(String contenidoTex) {
        this.contenidoTex = contenidoTex;
    }

    public Image getContenidoImg() {
        return contenidoImg;
    }

    public void setContenidoImg(Image contenidoImg) {
        this.contenidoImg = contenidoImg;
    }

    public List<Usuario> getUsuariosEtiquetados() {
        return usuariosEtiquetados;
    }

    public void setUsuariosEtiquetados(List<Usuario> usuariosEtiquetados) {
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
