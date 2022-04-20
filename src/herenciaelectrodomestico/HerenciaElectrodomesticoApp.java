/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectrodomestico;

import Entidades.Lavadora;
import Entidades.Local;
import Entidades.Televisor;
import Servicios.LavadoraServicio;
import Servicios.LocalServicio;
import Servicios.TelevisorServicio;

/**
 *
 * @author Jime
 */
public class HerenciaElectrodomesticoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LavadoraServicio ls = new LavadoraServicio();
        Lavadora lavadora = ls.crearLavadora();
        System.out.println(lavadora.toString());
        TelevisorServicio tvs = new TelevisorServicio();
        Televisor tv = tvs.crearTV();
        System.out.println(tv.toString());
        LocalServicio localServi = new LocalServicio ();
        Local local = localServi.crearLocal();
        localServi.adicionarElectro(tv, local);
        localServi.adicionarElectro(lavadora, local);
        System.out.println("______________________________");
        System.out.println("Los electros cargados son: ");
        localServi.mostrarElectros(local);
    }
    
}
