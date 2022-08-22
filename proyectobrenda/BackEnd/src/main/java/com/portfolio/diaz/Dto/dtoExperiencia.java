/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.diaz.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
     @NotBlank
    private String periodoEx;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String periodoEx) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;        
        this.descripcionE = periodoEx;
    }
    
    //Getters and Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
     public String getPeriodoEx() {
        return periodoEx;
    }

    public void setPeriodoEx(String periodoEx) {
        this.periodoEx = periodoEx;
    }
    
}
