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
    private static float valor;
    
    //Converte o valor da temperatura de Fahrenheit para Celcius
    public static void fahrenheitParaCelsius()throws Exception{
        if(Temperatura.valor<-459.67){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        Temperatura.valor=(float)((Temperatura.valor-32)*5/9);
    }
    public static void fahrenheitParaKelvin()throws Exception{
        if(Temperatura.valor<-459.67){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        Temperatura.valor=(float)((Temperatura.valor-32)*5/9+273.15);
    }
    //Converte o valor da temperatura de Celcius para Kelvin
    public static void celciusParaKelvin()throws Exception{
        if(Temperatura.valor<-273.15){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        Temperatura.valor=(float)(Temperatura.valor+273.15);
    }
    public static void celciusParaFahrenheit()throws Exception{
        if(Temperatura.valor<-273.15){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        Temperatura.valor=(float)((Temperatura.valor*9/5) + 32);
    }
    //Converte o valor da temperatura de Kelvin para Fahrenheit
    public static void kelvinParaFahrenheit()throws Exception{
        if(Temperatura.valor<0){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        Temperatura.valor=(float)(Temperatura.valor - 273.15)*9/5+32;
    }
    public static void kelvinParaCelsius()throws Exception{
        if(Temperatura.valor<0){
            throw new Exception("Valor inoperavel pois a temperatura está"
                    + " abaixo do zero absoluto");
        }
        Temperatura.valor=(float) ((Temperatura.valor)-273.15);
    }
    public static float getValor() {
        return valor;
    }

    public static void setValor(float valor) {
        Temperatura.valor = valor;
    }

}
