package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

public class LavadoraServicio extends ElectrodomesticoServicio{

    public LavadoraServicio() {
    }
    public Lavadora crearLavadora (){
        Electrodomestico electro =  super.crearElectrodomostico();
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese carga");
        Lavadora lavadora = new Lavadora (read.nextDouble(),electro.getPrecio(),electro.getColor(),electro.getConsumoEnergetico(),electro.getPeso());
        return lavadora;
    }
}
