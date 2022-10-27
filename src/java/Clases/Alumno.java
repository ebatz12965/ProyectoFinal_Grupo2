/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Edwing
 */
public class Alumno {
    
    private int codigoA;
    private Date fechaA;
    private String nombreA;
    private String correoA;
    private String passA;
    private String direccionA;
    private int telefonoA;
    private int sucursalA;
    private int gradoA;
    private int nivelA;    

    
    public Alumno(int codigoA, Date fechaA, String nombreA, String correoA, String passA, String direccion, int telefonoA, int sucursalA, int gradoA, int nivelA){
        this.codigoA=codigoA;
        this.fechaA=fechaA;
        this.nombreA=nombreA;
        this.correoA=correoA;
        this.passA=passA;
        this.direccionA=direccionA;     
        this.telefonoA=telefonoA;
        this.sucursalA=sucursalA;
        this.gradoA=gradoA;
        this.nivelA=nivelA;   
    }

    public int getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(int codigoA) {
        this.codigoA = codigoA;
    }

    public Date getFechaA() {
        return fechaA;
    }

    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getCorreoA() {
        return correoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }

    public String getPassA() {
        return passA;
    }

    public void setPassA(String passA) {
        this.passA = passA;
    }

    public String getDireccionA() {
        return direccionA;
    }

    public void setDireccionA(String direccionA) {
        this.direccionA = direccionA;
    }

    public int getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(int telefonoA) {
        this.telefonoA = telefonoA;
    }

    public int getSucursalA() {
        return sucursalA;
    }

    public void setSucursalA(int sucursalA) {
        this.sucursalA = sucursalA;
    }

    public int getGradoA() {
        return gradoA;
    }

    public void setGradoA(int gradoA) {
        this.gradoA = gradoA;
    }

    public int getNivelA() {
        return nivelA;
    }

    public void setNivelA(int nivelA) {
        this.nivelA = nivelA;
    }
    
    
}
