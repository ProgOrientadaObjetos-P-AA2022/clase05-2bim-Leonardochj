/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class TransporteTransvia {
    private String transvia;
    public double tarifa;
    
    public void establecerTransvia(String n){
        transvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    
    public String obtenerTransvia(){
        return transvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
