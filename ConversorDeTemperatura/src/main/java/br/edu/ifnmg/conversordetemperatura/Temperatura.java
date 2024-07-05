/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.conversordetemperatura;

/**
 *
 * @author braga
 */
public class Temperatura {
    private float valor;
    private String tipoTemperatura; 
   
     Temperatura(){
        this.valor = 0;
        this.tipoTemperatura = "celsius";
    }
    public void setTemperatura(float valor, String tipoTemperatura){
        this.valor = valor;
        this.tipoTemperatura = tipoTemperatura;
    }
    public void exibeTemperatura(){
        System.out.println("A temperatura é "+this.valor+" "+this.tipoTemperatura);
    }
    private void fahrenheitParaCelsius(float valor){
        this.valor=(float)((valor-32)*5/9);
    }
    private void kelvinParaFahrenheit(float valor){
        this.valor=(float)(valor*9/5-459.67);
    }
    private void celciusParaNovoKelvin(float valor){
        this.valor=(float)(valor+273.15);
    }
    
 }
