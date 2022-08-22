/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.diaz.Dto;

import javax.validation.constraints.NotBlank;


public class dtoAcercade {
    @NotBlank
    private String acerca;
    
    //constructor

    public dtoAcercade() {
    }

    public dtoAcercade(String acerca) {
        this.acerca = acerca;
    }
    
    //getter and setters

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }
    
    
}