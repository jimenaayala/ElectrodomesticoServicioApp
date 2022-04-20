/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jime
 */
public class Local {
    private List<Electrodomestico> electros = new ArrayList <>();

    public Local() {
    }

    public List<Electrodomestico> getElectros() {
        return electros;
    }

    public void setElectros(Electrodomestico electro) {
        this.electros.add(electro);
    }

    @Override
    public String toString() {
        return "Local{" + "electros=" + electros + '}';
    }

}
