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
public class Nivel3 {
    //ejercicio9 
    //buscar el valor maximo y minimo  de 10 numeros
    
    public void ejercicio9 (){
        Scanner scanner = new Scanner (System.in);
        int[] busqueda = new int[10] ;
        
        System.out.println("°°°°°Ingresa los 10 numeros enteros: °°°°°°");
        //empezamos el for 
        for (int i = 0; i< busqueda.length; i++){
            System.out.println ("Número " + (i + 1) + ": ");
            busqueda[i] = scanner.nextInt();
        }//fin del for
       
        int mayor = busqueda[0];
        int menor = busqueda[0];
        for (int i=0; i<busqueda.length; i++){
            if (busqueda[i] > mayor){
                mayor= busqueda[i]; //con etso se actualiza el mayor cada vez 
            }
            if (busqueda[i] < menor) {
                menor = busqueda[i];//actualizamos el menor 
            }
        
    }
        System.out.println(" El valor mayor es: " + mayor);
        System.out.println(" El valor menor es: " + menor);
        
        
        
    }//fin del metodo 
    
   // ejercicio10
    //leer un arreglo y solicitar un  numero a buscar 
    //cada que iniciamos un arreglo hacer: metodo y scanner
    public void ejercicio10 (){
        Scanner scanner = new Scanner (System.in);
        int[] numeros= new int[10];
       
        System.out.println("°°°Ingresa 10 numeros enteros: ");
        for (int i = 0; i<numeros.length; i++){
            System.out.println("Numero " + (i+1)+ ": ");
            numeros[i] = scanner.nextInt();
        }
        //ahora pedimos el numero que se buscara 
        System.out.println("Ingrese el numero que se quiere buscar: ");
        int buscarNumero = scanner.nextInt();
        
        int posicion= -1;// esto para verificar si existe 
        for (int i = 0; i<numeros.length; i++){
            if (numeros[i] == buscarNumero){
                posicion= i;
                break;
            }
        }
        System.out.println("Resultado de la posicion: " + posicion);
    }
}
