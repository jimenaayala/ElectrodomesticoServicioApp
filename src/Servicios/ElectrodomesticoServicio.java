package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    public Electrodomestico crearElectrodomostico() {
        Electrodomestico electro = new Electrodomestico();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese color, consumo energetico, peso y precio");
        electro.setColor(comprobarColor(read.nextLine()));
        electro.setConsumoEnergetico(comprobarConsumoEner(read.next().charAt(0)));
        electro.setPeso(read.nextDouble());
        electro.setPrecio(precioFinal(electro.getConsumoEnergetico(), electro.getPeso(), read.nextDouble()));
        return electro;
    }

    public void precioFinal() {
    }

    public char comprobarConsumoEner(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    public double precioFinal(char consumo, double peso, double precioElectro) {
        double precio = precioElectro;
        switch (consumo) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }
        if (peso>=1 && peso <= 19){
            precio = precio + 100;
        }
        if (peso>19 && peso<=49){
            precio = precio + 500;
        }
        if (peso >49 && peso<=79){
            precio = precio +800;
        }
        if (peso >79){
            precio = precio+1000;
        }
        return precio;
    }
}
