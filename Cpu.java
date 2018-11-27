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
class Cpu {
 private int nucleos = 0;
    private int ram = 0;

    //constructores
    public Cpu() {
    }

    public Cpu(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }

    //setters
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //getters
    public int getNucleos() {
        return nucleos;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Cpu{" + "nucleos=" + nucleos + ", ram=" + ram + '}';
    }

}
