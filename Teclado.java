/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ordenador;

/**
 *
 * @author jalvarezotero
 */
class Teclado {
    private int numTeclas = 0;

    //constructores
    public Teclado() {
    }

    public Teclado(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    //setters
    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    //getters
    public int getNumTeclas() {
        return numTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "numTeclas=" + numTeclas + '}';
    }
}