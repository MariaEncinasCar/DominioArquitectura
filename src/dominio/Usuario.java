/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

public class Usuario{
    private String nombre;
    private String email;
    private String contrasena;
    private String celular;
    private String sexo;
    private Date fechaNac;
    private int edad;
    
    public Usuario()
    {
        
    }

    public Usuario(String nombre, String email, String contrasena, 
            String celular, String sexo, Date fechaNac, int edad) 
    {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.celular = celular;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.edad = edad;
    }
    
    public Usuario(String nombre, String email, String contrasena, 
            String sexo, Date fechaNac, int edad) 
    {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.edad = edad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getContrasena() 
    {
        return contrasena;
    }

    public void setContrasena(String contrasena) 
    {
        this.contrasena = contrasena;
    }

    public String getCelular() 
    {
        return celular;
    }

    public void setCelular(String celular) 
    {
        this.celular = celular;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }

    public Date getFechaNac() 
    {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) 
    {
        this.fechaNac = fechaNac;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + ", contrasena=" + contrasena + ", celular=" + celular + ", sexo=" + sexo + ", fechaNac=" + fechaNac + ", edad=" + edad + '}';
    }
}
