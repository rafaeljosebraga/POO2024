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
        System.out.println("A temperatura é "+this.valor+" "
        +this.tipoTemperatura);
    }
    //Converte o valor da temperatura de Fahrenheit para Celcius
    private void fahrenheitParaCelsius(float valor){
        this.valor=(float)((valor-32)*5/9);
    }
    //Converte o valor da temperatura de Celcius para Kelvin
    private void celciusParaKelvin(float valor){
        this.valor=(float)(valor+273.15);
    }
    //Converte o valor da temperatura de Kelvin para Fahrenheit
    private void kelvinParaFahrenheit(float valor){
        this.valor=(float)(valor*9/5-459.67);
    }
    //Converte a temperatura para a temperatura designada no campo de argumento
    public void converteTemperatura(String tipoTempFinal){
        if(tipoTempFinal!="fahrenheit"||tipoTempFinal!="celcius"||tipoTempFinal!="kelvin"){
            System.out.println("Temperatura não suportada");
            return;
        }
        if(tipoTempFinal.equals(tipoTemperatura)){
            return;
        }
        switch(tipoTemperatura){
            case "fahrenheit":
                if(tipoTempFinal.equals("celcius")){
                    fahrenheitParaCelsius(valor);
                    return;
                }
                fahrenheitParaCelsius(valor);
                celciusParaKelvin(valor);
                break;
                
            case "celcius":
                if(tipoTempFinal.equals("kelvin")){
                    celciusParaKelvin(valor);
                    return;
                }
                celciusParaKelvin(valor);
                kelvinParaFahrenheit(valor);
                break;
                
            case "kelvin":
                if(tipoTempFinal.equals("fahrenheit")){
                    kelvinParaFahrenheit(valor);
                }
                kelvinParaFahrenheit(valor);
                fahrenheitParaCelsius(valor);
                break;
        }
    tipoTemperatura=tipoTempFinal;        
    }
 }
