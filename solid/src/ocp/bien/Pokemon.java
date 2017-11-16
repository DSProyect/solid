/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ocp.bien;

import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public abstract class Pokemon implements ataquePokemon{
    private String nombre;
    private String tipo;
    private String habilidad;
    private double porcentajeVida;
    /* le agregué un arreglo por si el pokemon tiene mas de 1 tipo de ataque
    diferente*/
    private ArrayList<atack> ataques = new ArrayList<>();

    
   
    public Pokemon() {
        
    }

    
    public Pokemon(String nombre, String tipo, String habilidad, double porcentajeVida, ArrayList<atack> ataques){
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.porcentajeVida = porcentajeVida;
        this.ataques = ataques;
    }
    
    
    public Pokemon(String nombre, String tipo, String habilidad, double porcentajeVida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.porcentajeVida = porcentajeVida;
    }

    
    
    public Pokemon(String nombre, String tipo, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.porcentajeVida=100;
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public double getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(double porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }


    public ArrayList<atack> getAtaques() {
        return ataques;
    }

    public void setAtaques(ArrayList<atack> ataques) {
        this.ataques = ataques;
    }
    
    /*este metodo puede servir para cualquier tipo de pokemon*/
    @Override
    public void calcularAtaque() {
        for(atack a: ataques){
            porcentajeVida = porcentajeVida*(a.getValorAtaque());
        }
    }
  
}

