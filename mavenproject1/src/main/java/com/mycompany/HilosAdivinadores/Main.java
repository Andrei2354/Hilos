/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HilosAdivinadores;

/**
 *
 * @author Andre
 */
public class Main {
    public static void main(String[] args) {
        NumeroOculto juego = new NumeroOculto();
        Adivinador[] adivinadores = new Adivinador[10];

        for (int i = 0; i < adivinadores.length; i++) {
            adivinadores[i] = new Adivinador(juego, i);
            adivinadores[i].start();
        }

        for (Adivinador adivinador : adivinadores) {
            try {
                adivinador.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Juego terminado.");
    }
}