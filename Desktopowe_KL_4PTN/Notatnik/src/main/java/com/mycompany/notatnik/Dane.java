/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notatnik;

/**
 *
 * @author kacpe
 */
public class Dane {
    private int id;
    private String tytul;
    private String notka;
    private String data;
    
    public Dane(int id, String tytul, String notka, String data){
        this.id = id;
        this.tytul = tytul;
        this.notka = notka;
        this.data = data;
    }
    
    public String getTytul(){
        return tytul;
    }
    
    public String getNotka(){
        return notka;
    }
    
    public String getData(){
        return data;
    }
    
}
