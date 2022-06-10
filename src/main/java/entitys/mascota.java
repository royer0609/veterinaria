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
public class mascota {
    private int idMascota;
    private String nombreMascota;
    private String especie;
    private String raza;
    private String hClinica;

    public mascota() {
    }

    public mascota(int idMascota, String nombreMascota, String especie, String raza, String hClinica) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.hClinica = hClinica;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String gethClinica() {
        return hClinica;
    }

    public void sethClinica(String hClinica) {
        this.hClinica = hClinica;
    }
    
    
}
