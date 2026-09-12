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
public class Nivel5 {
    //ejercicio 17 
    //suma de dos arreglos y pasarlos a uno solo 
    public void ejercicio17(){
        Scanner scanner = new Scanner ( System.in);
        // cramos los arreglos 
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        int[] arregloHijo = new int[10];
        
        //pedimos los numeros 
        System.out.println("°°° Digite los 10 numeros enteros para el 1° arreglo °°°");
        for (int i = 0; i<arreglo1.length; i++){
            System.out.println(" Numero " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }//fin del for 1 
        
        System.out.println("°°° Digite los 10 numeros enteros para el 2° arreglo °°°");
        for (int i = 0; i<arreglo2.length; i++){
            System.out.println(" Numero " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        
    }// fin del for 2
        //generamos el arreglo hijo 
        for ( int i = 0; i < arregloHijo.length; i++){
            arregloHijo[i]= arreglo1[i] + arreglo2[i];
        }
        System.out.println ("\n Este es el resultado del arreglo final: ");
        for ( int i = 0; i < arregloHijo.length; i++){
            System.out.println (arregloHijo[i] + " ");
        }
         System.out.println("\n");
   }//fin del ejercicio 17
    
    //ejercicio 18
    // Diferencia de precios y promedio 
    public void ejercicio18(){
        Scanner scanner = new Scanner ( System.in);
        double[] precios1 = new double[10];
        double[] precios2 = new double[10];
        double[] diferencia = new double[10];
        double sumaDiferencia = 0;
        
         System.out.println("°°°° Ingresa los precios para el 1° arreglo °°°°°°");
         for (int i =0; i < precios1.length; i++){
         System.out.println ("Precio 1 [ " + (i + 1) + "] : ");
         precios1[i] = scanner.nextDouble();// asi escanea los decimales 
             
         }
          System.out.println("°°°° \n Ingresa los precios para el 2° arreglo °°°°°°");
         for (int i =0; i < precios2.length; i++){
         System.out.println ("Precio 1 [ " + (i + 1) + "] : ");
         precios2[i] = scanner.nextDouble();// asi escanea los decimales 
             
         }
         //calculamos
         for ( int i = 0; i < diferencia.length; i++){
             //utilizaremos  Math.abs que se asegura de que la resta de positivo 
             diferencia[i] = Math.abs ( precios1[i] - precios2[i]);
             sumaDiferencia += diferencia[i];
         }
         System.out.println ("\n Diferencias absolutas:  ");
          for (int i = 0; i < diferencia.length; i++){
             System.out.println (diferencia[i] + " ");
    
    }
          //calculamos el promedio ahora 
          double promedio = sumaDiferencia / diferencia.length;
          System.out.println ("\n El promedio de las diferencias es : " + promedio);
          System.out.println();
    }
    
}
