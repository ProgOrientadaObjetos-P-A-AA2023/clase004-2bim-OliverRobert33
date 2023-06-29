/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

public class TransporteBus {
    private String cooperativaBus;
    public double tarifa;
    
    public void establecerCooperativaBus(String n){
        cooperativaBus = n;
    }
    
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaBus;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
