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
 * @author Equipo6
 */
public class Comentario {

    private Date fechaHoraCreacion;
    private String contenidoTex;
    private Image contenidoImg;
    private List<String> etiquetas;
    private List<Usuario> usuariosEtiquetados;
    private Publicacion publicacion;

    public Comentario() {
        
    }
    
    public Comentario(Date fechaHoraCreacion, String contenidoTex, 
            Image contenidoImg, List<String> etiquetas, 
            List<Usuario> usuariosEtiquetados, Publicacion publicacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.contenidoTex = contenidoTex;
        this.contenidoImg = contenidoImg;
        this.etiquetas = etiquetas;
        this.usuariosEtiquetados = usuariosEtiquetados;
        this.publicacion = publicacion;
    }

    
    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
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

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Usuario> getUsuariosEtiquetados() {
        return usuariosEtiquetados;
    }

    public void setUsuariosEtiquetados(List<Usuario> usuariosEtiquetados) {
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    
    
    
}
