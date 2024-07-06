/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.conversordetemperaturaestatico;

/**
 *
 * @author braga
 */
public class Temperatura {
    private float valor;
     
    public void setValorTemperatura(float valor){
        this.valor = valor;
    }
    
    public void exibeTemperatura(){
        System.out.println("A temperatura é "+this.valor);
    }
    //Converte o valor da temperatura de Fahrenheit para Celcius
    public void fahrenheitParaCelsius()throws Exception{
        if(this.valor<-459.67){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float)((this.valor-32)*5/9);
    }
    public void fahrenheitParaKelvin()throws Exception{
        if(this.valor<-459.67){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float)((this.valor-32)*5/9+273.15);
    }
    //Converte o valor da temperatura de Celcius para Kelvin
    public void celciusParaKelvin()throws Exception{
        if(this.valor<-273.15){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float)(this.valor+273.15);
    }
    public void celciusParaFahrenheit()throws Exception{
        if(this.valor<-273.15){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float)((this.valor*9/5) + 32);
    }
    //Converte o valor da temperatura de Kelvin para Fahrenheit
    public void kelvinParaFahrenheit()throws Exception{
        if(this.valor<0){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float)(this.valor*9/5-459.67);
    }
    public void kelvinParaCelsius()throws Exception{
        if(this.valor<0){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float) ((this.valor)-273.15);
    }
    
    
    //Converte a temperatura para a temperatura designada no campo de argumento

}
