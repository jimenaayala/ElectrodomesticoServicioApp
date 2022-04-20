/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Local;


/**
 *
 * @author Jime
 */
public class LocalServicio {
    
    public Local crearLocal() {
        Local local = new Local();
        return local;
    }
    public void adicionarElectro (Electrodomestico electro, Local local){
        local.setElectros(electro);
    }
    public void mostrarElectros(Local local){
        double sumaPrecios = 0;
        for (Electrodomestico electro : local.getElectros()) {
            System.out.println(electro.toString());
            sumaPrecios = sumaPrecios + electro.getPrecio();
        }
        System.out.println("****La suma de los precios de los electros es: "+ sumaPrecios+ "****");
    }
    
}
