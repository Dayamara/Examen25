/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VilatuñaJ.modelo;

/**
 *
 * @author UseR
 */
public class persona {
    private String ci,nombre,apellido,fechaNac,telefono,email,cargaHor;

    public persona() {
    }

    public persona(String ci, String nombre, String apellido, String fechaNac, String telefono, String email, String cargaHor) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.cargaHor = cargaHor;
    }

    /**
     * @return the ci
     */
    public String getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaNac
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cargaHor
     */
    public String getCargaHor() {
        return cargaHor;
    }

    /**
     * @param cargaHor the cargaHor to set
     */
    public void setCargaHor(String cargaHor) {
        this.cargaHor = cargaHor;
    }
    
    @Override
    public String toString(){
        return "\n CI: "+getCi()+"\n NOMBRE: "+getNombre()+"\n APELLIDO: "+getApellido()+"\n FECHA DE NACIMIENTO: "+getFechaNac()+"\n TELÉFONO: "+
                getTelefono()+"\n E-MAIL: "+getEmail()+"\n CARGA HORARIA: "+getCargaHor();
    }
}
