/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

/**
 *
 * @author Melany Amador
 */
public class Nivel1 {
    public void ejercicio1(){
    
   //ejercicio 1: Crear un arreglo de 4num decimales inicializado con valores literales 
    //literales se refiere a devolver los num de las {} sin pedirselos al user 
    //indice: se rfierea las posiciones 0,1,2,3
    //ultimo elemento =posicion 3
    //inicializamos el arreglo y valores decimales 
    double[] numeros = {10.7, 70.29, 98.89, 22.90};
    
    //obtener longitud
    int longitud = numeros.length;
    System.out.println ("La longitud de nuestro arreglo es: " + longitud);
    //posicion 3
    System.out.println("El último decimal es:  " + numeros[longitud-1]);
    }
    
    //ejercicio2
    //crear un arreglos de 6 valores booleanos 
    public void ejercicio2 (){
        boolean[] disposicion= {true,false,true,false,false,true};
        for (int i =0; i< disposicion.length; i++){
            System.out.println("Estos son las disposiciones de los valores: " + disposicion[i]);
        }
        
        
        
        
    }
}
