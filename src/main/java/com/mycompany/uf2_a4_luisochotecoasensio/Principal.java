/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf2_a4_luisochotecoasensio;

/**
 *
 * @author LuisOchotecoAsensio-
 */
public class Principal {
    
    public static void main (String [] args){
        //    2   <----
        //instanciar objetosRectangulo obj2 = new Rectangulo(10, 20);
        Rectangulo obj1 = new Rectangulo();
        Rectangulo obj2 = new Rectangulo(10, 20);
        Rectangulo obj3 = new Rectangulo(30, 20);
        //    3   <----
        System.out.println("Base = "+ obj1.getBase() + ", Altura = " + obj1.getAltura());
        obj1.setBase(30);
        obj1.setAltura(20);
        //Creo dos variables para que quede más claro
        float areaObj1 = (obj1.getBase() * obj1.getAltura());
        float areaObj2 = (obj2.getBase() * obj2.getAltura());
        System.out.println("El ára del rectángulo es = " + areaObj1);
        if (areaObj1 > areaObj2){
            System.out.println("El área más grande entre el objeto 1 (" + areaObj1
                    + ") y el objeto 2 (" + areaObj2 + ") es el objeto 1 = " + areaObj1 );
        } 
        if (areaObj1 < areaObj2){
            System.out.println("El área más grande entre el objeto 1 (" + areaObj1
                    + ") y el objeto 2 (" + areaObj2 + ") es el objeto 2 = " + areaObj2 );
        }
        if (areaObj1 == areaObj2) {
            System.out.println("El área de los objetos son iguales; objeto 1 (" + areaObj1
                    + ") = objeto 2 (" + areaObj2);
        }
        System.out.println(obj1.toString());
    }
}
