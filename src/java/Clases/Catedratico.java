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
public class Catedratico {
    
    private int codigoC;
    private Date fechaC;
    private String nombreC;
    private String correoC;
    private String passC;
    private String direccionC;
    private int telefonoC;
    private int sucursalC;    

    
    public Catedratico(int codigoC, Date fechaC, String nombreC, String correoC, String passC, String direccionC, int telefonoC, int sucursalC){
        this.codigoC=codigoC;
        this.fechaC=fechaC;
        this.nombreC=nombreC;
        this.correoC=correoC;
        this.passC=passC;
        this.direccionC=direccionC;     
        this.telefonoC=telefonoC;
        this.sucursalC=sucursalC;
    }

    public int getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getCorreoC() {
        return correoC;
    }

    public void setCorreoC(String correoC) {
        this.correoC = correoC;
    }

    public String getPassC() {
        return passC;
    }

    public void setPassC(String passC) {
        this.passC = passC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public int getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(int telefonoC) {
        this.telefonoC = telefonoC;
    }

    public int getSucursalC() {
        return sucursalC;
    }

    public void setSucursalC(int sucursalC) {
        this.sucursalC = sucursalC;
    }
    
    
}
