/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

import java.util.Scanner;

/**
 *
 * @author Melany Amador
 */
public class Nivel4 {

    private int i;
    //ejerccio 13 invertir un arreglo en el mismo arreglo
    public void ejercicio13(){
        Scanner scanner = new Scanner (System.in);
        int[] datos = new int[10];
        
        //lectura de los 10 datos 
        System.out.println("Ingrese los 10 numeros enteros ");
        for( int i=0; i< datos.length; i++){
        System.out.println("Numero " + (i + 1 )+ ": ");
        datos[i] = scanner.nextInt();
 
    }//fin del for 
        
    int n = datos.length;
    for( int i=0; i< n / 2; i++){
    int aux = datos[i];
    datos[i] = datos [n - 1 -i];
    datos [n- 1 - i]=aux; 
     }
    System.out.println("Arreglo invertido: ");
    for (int i = 0; i < datos.length; i++){
        System.out.println(datos[i] + "");
    }
}
    
    
    //ejercicio 14 
    //copia de un arreglo
    public void ejercicio14(){
        Scanner scanner =new Scanner (System.in);
        int[] original= new int[10];
        int[] copia = new int[10];
        
        //hacemos la lectura de el arreglo original
        System.out.println("°°°Ingrese los 10 numeros enteros°°°");
        for (int i= 0; i< original.length; i++){
          System.out.println("Numero " + (i + 1) + ": ");
          original[i]= scanner.nextInt();
        }//fin del for
        //copiamos eemento por elemento 
   for (int i= 0; i< original.length; i++){
       copia[i] = original[i];
   }
        //modificamos la copia 
        copia[0] = 17;
        
        System.out.println("\n Arreglo original: " );
        for (int i= 0; i< original.length; i++){
             System.out.println(original[i] + " ");
        }
        
         System.out.println ("Arreglo copia con la primer posicion en 17: ");
        for ( int i =0; i< copia.length; i++){
             System.out.println(copia[i] + " ");
        }
        System.out.println("\n");
    }
     
}

