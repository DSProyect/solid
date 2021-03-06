/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2lsp.bien;

import _2lsp.mal.*;

/**
 *
 * @author Palacios
 */
public class NavegacionTest {
    
    
    /*
     Si enviamos una moto acuatica y no está encendida, obtendremos una excepción.
    */
    public static void navegacion(VehiculoAcuatico... vehiculosAcuaticos) {
		for (VehiculoAcuatico vehiculo : vehiculosAcuaticos) {
			vehiculo.navegar();
		}
	}
    public static void main(String[] args) {
        VehiculoAcuatico moto = new MotoAcuatica();
        navegacion(moto);
    }
}
