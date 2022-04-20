package Entidades;

public class Televisor extends Electrodomestico {
    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + '}'+super.toString();
    }
    
    
}
