/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.verificacadastropessoal;

/**
 *
 * @author braga
 */
public class VerificaCadastroPessoal {
    public static int obterDigito(long cpf,int digito){
        String aux;
        long cpfAux;
        aux=Long.toString(cpf);
        int tamanho= aux.length();
        
        //remove caracteres não numéricos
        aux=aux.replaceAll("[^\\d]+", "");
        
        cpfAux=Long.parseLong(aux);
        long auxLong;
        auxLong=(long)Math.pow(10, digito);
        cpfAux=cpfAux % auxLong;
        cpfAux=(long) (cpfAux/Math.pow(10, digito-tamanho));
        return (int)cpfAux;
    }
    
    public static int obterDigito(String cpf,int digito){
        String aux;
        long cpfAux;
        int tamanho= cpf.length();
        
        //remove caracteres não numéricos
        aux=cpf.replaceAll("[^\\d]+", "");
        
        cpfAux=Long.parseLong(aux);
        long auxLong;
        auxLong=(long)Math.pow(10, digito);
        cpfAux=cpfAux % auxLong;
        cpfAux=(long) (cpfAux/Math.pow(10, digito-tamanho));
        return (int)cpfAux;
        
    }
    
    public static boolean isCpfValido(String cpf){
        
    }
    
}
