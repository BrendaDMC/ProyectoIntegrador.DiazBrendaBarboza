/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.diaz.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String html;
    @NotBlank
    private String css;
    @NotBlank
    private String js;
    @NotBlank
    private String git;
    @NotBlank
    private String en;
    @NotBlank
    private String comp;
    
  //constructor

    public dtoHys() {
    }

    public dtoHys(String html, String css, String js, String git, String en, String comp) {
        this.html = html;
        this.css = css;
        this.js = js;
        this.git = git;
        this.en = en;
        this.comp = comp;
    }
    
    //getters and setters

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }
    
    
    
}

