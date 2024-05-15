/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf2_a4_luisochotecoasensio;
import java.util.Scanner;
/**
 *
 * @author LuisOchotecoAsensio-
 */
public class Rectangulo {
    //   1  <-----
    //Atributos
    float base;
    float altura;
    //Constructores
    public Rectangulo(){
    }
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    //Getters
    public float getBase(){
        return this.base;
    }    
    public float getAltura(){
        return this.altura;
    }
    //Setters
    public void setBase(float base){
        this.base = base;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    //    4  <----
    public void leer(){
        Scanner read = new Scanner(System.in);
        System.out.println("Base :");
        this.setBase(read.nextFloat());
        System.out.println("Altura :");
        this.setAltura(read.nextFloat());
    }
    public void mostrar(){
        System.out.println("Base = " + this.getBase() + ", Altura = " +
                this.getAltura());
    }
    public float area(){
        float area = this.getBase() * this.getAltura();
        return area;
    }
    public boolean equals(Rectangulo objeto){
        boolean R = false;
        if (this.getBase() == objeto.base && this.getAltura()  == objeto.altura){
            R = true;
        }
        return R;
    }
    public String toString(){
        String str = "Base:" + this.getBase() + ", altura:" + this.getAltura();
        return str;        
    }
} 
