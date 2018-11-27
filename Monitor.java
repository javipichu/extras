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
class Monitor {

    private String marca = " ";
    private float pulgadas = 0.0f;

    //constructores
    public Monitor() {
    }

    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", pulgadas=" + pulgadas + '}';
    }

}

