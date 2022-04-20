package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

public class TelevisorServicio extends ElectrodomesticoServicio {

    public TelevisorServicio() {
    }
      public Televisor crearTV (){
        Electrodomestico electro =  super.crearElectrodomostico();
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese resolucion y TDT (true, false)");
        Televisor tv = new Televisor (read.nextDouble(),read.nextBoolean(),electro.getPrecio(),electro.getColor(),electro.getConsumoEnergetico(),electro.getPeso());
        return tv;
    }
}
