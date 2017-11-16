/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _1ocp.bien;

/**
 *
 * @author Junior
 */
public class atack {
    /**/
    private String tipoAtaque;
    private double valorAtaque;

    public atack() {
    }

    public atack(String tipoAtaque, double valorAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.valorAtaque = valorAtaque;
    }

    
    
    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public double getValorAtaque() {
        return valorAtaque;
    }

    public void setValorAtaque(double valorAtaque) {
        this.valorAtaque = valorAtaque;
    }
    
    
}
