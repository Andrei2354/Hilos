/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HilosAdivinadores;

/**
 *
 * @author Andre
 */
public class Adivinador extends Thread {
    private final NumeroOculto juego;
    private final int id;

    public Adivinador(NumeroOculto juego, int id) {
        this.juego = juego;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            int propuesta = (int) (Math.random() * 101); 
            int resultado = juego.propuestaNumero(propuesta);
            System.out.println("Hilo " + id + " propone: " + propuesta + " - Resultado: " + resultado);

            if (resultado == 1) {
                System.out.println("Hilo " + id + ", a adivinado el numero  que es " + propuesta );
                break;
            } else if (resultado == -1) {
                System.out.println("Hilo " + id + " termina su ejecucion, juego ya terminado.");
                break; 
            }
        }
    }
}

