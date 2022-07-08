/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

// Cambios - 8 - julio - 2022
/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Transporte> listaTransportes = new ArrayList<>();
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        listaTransportes.add(bus);
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        listaTransportes.add(taxi);
        
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerTransvia("Motupe");
        transvia.establecerTarifa();
        listaTransportes.add(transvia);
        
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(listaTransportes);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
