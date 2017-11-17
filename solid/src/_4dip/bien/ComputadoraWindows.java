/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.bien;

import _4dip.mal.*;

/**
 *
 * @author Palacios
 */
public class ComputadoraWindows implements Computadora {
    private int ram;
    private int almacenamiento;
    private String SO;

    public ComputadoraWindows(int ram, int almacenamiento) {
        this.SO = "Windows";
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public ComputadoraWindows() {
        
    }

    @Override
    public String getSO() {
        return SO;
    }

    @Override
    public void setSO(String SO) {
        this.SO = SO;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
