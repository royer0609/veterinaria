/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

/**
 *
 * @author Asus
 */
public class amo {
    private int idAmo;
    private String nombre;
    private long telefono;
    private String direccion;

    public amo() {
    }

    public amo(int idAmo, String nombre, long telefono, String direccion) {
        this.idAmo = idAmo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdAmo() {
        return idAmo;
    }

    public void setIdAmo(int idAmo) {
        this.idAmo = idAmo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}