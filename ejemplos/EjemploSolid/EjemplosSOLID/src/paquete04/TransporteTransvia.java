/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteTransvia extends Transporte {

    private String transvia;

    public void establecerTransvia(String n) {
        transvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 3.50 + 0.50;
    }

    public String obtenerTransvia() {
        return transvia;
    }

}
