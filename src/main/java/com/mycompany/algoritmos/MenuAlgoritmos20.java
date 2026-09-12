/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author Melany Amador
 */
public class MenuAlgoritmos20 {

    Nivel1 n1 = new Nivel1();
    Nivel2 n2 = new Nivel2();
    Nivel3 n3 = new Nivel3();
    Nivel4 n4 = new Nivel4();
    Nivel5 n5 = new Nivel5();

    public void mostrarMenu() {
        int opcion = -1;
        String respuesta = "";
        do {
            respuesta= JOptionPane.showInputDialog(null, "°°°Bienvenid@ a la clase Menú de nuestros algoritmos"
                    + "\n ¿Qué algoritmo te gustaria utilizar?"
                    + "\n 1. Arreglo de 4 numeros decimales"
                    + "\n 2. Arreglo de 6 valores booleanos y mostrar sus valores"
                    + "\n 3. algoritmo de Jime "
                    + "\n 4. jime "
                    + "\n 5.Leer 8 numeros decimales y calcular el promedio"
                    + "\n 6.Arreglo de 20 valores booleanos para tomar asistencia "
                    + "\n 7. jime "
                    + "\n 8. jime"
                    + "\n 9  De 10 numeros determinar el mayor y el menor "
                    + "\n 10.Leer un arreglo y buscar un numero  "
                    + "\n 12. jime"
                    + "\n 12. jime"
                    + "\n 13. Invertir un arreglo de enteros  "
                    + "\n 14. Crear una copia de un arreglo de 10 enteros  "
                    + "\n 15.jime"
                    + "\n 16.jime "
                    + "\n 17. Dos arreglos de igual tamaño y un tercero con la suma de estos "
                    + "\n 18. Dos arreglos de precios de igual tamaño y calcular el promedio "
                    + "\n 19  De 10 numeros determinar el mayor y el menor "
                    + "\n 20.Leer un arreglo y buscar un numero  ");
            opcion = Integer.parseInt(respuesta);

            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 1...");
                    n1.ejercicio1();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 2...");
                    n1.ejercicio2();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 3...");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 4...");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 5...");
                    n2.ejercicio5();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 6...");
                    n2.ejercicio6();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 7...");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 8...");

                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 9...");
                    n3.ejercicio9();
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 10...");
                    n3.ejercicio10();
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 11...");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 12...");
                    break;
                case 13:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 13...");
                    n4.ejercicio13();
                    break;
                case 14:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 14...");
                    n4.ejercicio14();
                    break;
                case 15:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 15...");
                    break;
                case 16:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 16...");
                    break;
                case 17:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 17...");
                    n5.ejercicio17();
                    break;
                case 18:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 18...");
                    n5.ejercicio18();
                    break;
                case 19:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 19v");
                    break;
                case 20:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 20...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digitaste un numero incorrecto :( ");
                    break;
            }

        } while (opcion != 0);
    }
}
