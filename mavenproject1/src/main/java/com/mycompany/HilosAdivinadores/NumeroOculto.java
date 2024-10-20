/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HilosAdivinadores;

import java.util.Random;

public class NumeroOculto {
    private final int numeroOculto; 
    private boolean juegoTerminado;

    public NumeroOculto() {
        Random random = new Random();
        this.numeroOculto = random.nextInt(101); 
        this.juegoTerminado = false;
    }

    public synchronized int propuestaNumero(int num) {
        if (juegoTerminado) {
            return -1;
        }
        if (num == numeroOculto) {
            juegoTerminado = true; 
            return 1; 
        }
        return 0;
    }
}
