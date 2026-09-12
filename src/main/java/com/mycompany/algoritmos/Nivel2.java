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
public class Nivel2 {

    private int i;

    //ejercicio5
    //Promedio de 8 numeros decimales 
    public void ejercicio5() {
        double[] numeros = new double[8];
        double suma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            String respuesta = JOptionPane.showInputDialog(null, "Ingrese el número decimal " + (i + 1) + " :");
            numeros[i] = Double.parseDouble(respuesta);
            suma = suma + numeros[i];
        }//din del for
        double promedio = suma / numeros.length;
        String promedioFinal = String.format("%.2f", promedio);

        JOptionPane.showMessageDialog(null, " El promedio general es: " + promedioFinal);

    }

    //ejercicio 6 
    //20 valores para mostrar la asistencia y las ausencias 
    //true sera que 1 mas para asistio
    //false no asistio 
    public void ejercicio6() {
        boolean[] asistencia = {true, false, true, true, false, false, true, false, true, false, false, true, false, true, true, true,
            false, false, true, true};
        int presentes = 0;
        int faltaron = 0;

        //recorrido y cuenta 
        for (i = 0; i < asistencia.length; i++) {
            if (asistencia[i] == true) {
                presentes = presentes + 1;

            } else {
                faltaron = faltaron + 1;
            }//fin del if else 
        }//fin del for
        //calculamos el porsentaje
        double porcentaje = (presentes * 100.0) / asistencia.length;

        //resultados finales
        System.out.println("Cantidad de asistentes: " + presentes);
        System.out.println("Cantidad de ausentes: " + faltaron);
        System.out.printf("Porcentaje de asistentes: %.2f%%\n ", porcentaje);

    }

}
