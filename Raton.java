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
class Raton {
private boolean inhalambrico = false;
    private String modelo = " ";

    //constructores
    public Raton() {
    }

    public Raton(boolean inhalambrico, String modelo) {
        this.inhalambrico = inhalambrico;
        this.modelo = modelo;
    }

    //setters
    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //getters
    public boolean getInhalambrico() {
        return inhalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Raton{" + "inhalambrico=" + inhalambrico + ", modelo=" + modelo + '}';
    }
}