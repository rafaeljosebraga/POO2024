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
   
     Temperatura(){
        this.valor = 0;
    }
     
    public void setValorTemperatura(float valor){
        this.valor = valor;
    }
    
    public void exibeTemperatura(){
        System.out.println("A temperatura é "+this.valor);
    }
    //Converte o valor da temperatura de Fahrenheit para Celcius
    private void fahrenheitParaCelsius(){
        this.valor=(float)((this.valor-32)*5/9);
    }
    //Converte o valor da temperatura de Celcius para Kelvin
    private void celciusParaKelvin(){
        this.valor=(float)(this.valor+273.15);
    }
    //Converte o valor da temperatura de Kelvin para Fahrenheit
    private void kelvinParaFahrenheit(){
        this.valor=(float)(this.valor*9/5-459.67);
    }
    
    //Converte a temperatura para a temperatura designada no campo de argumento

}
