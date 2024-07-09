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
        this.valor=(float)(this.valor - 273.15)*9/5+32;
    }
    public void kelvinParaCelsius()throws Exception{
        if(this.valor<0){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        this.valor=(float) ((this.valor)-273.15);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
