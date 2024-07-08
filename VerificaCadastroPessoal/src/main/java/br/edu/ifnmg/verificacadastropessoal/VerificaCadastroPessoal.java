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
//    private static int obterDigito(long cpf,int posicao){
//        String aux;
//        long digito;
//        aux=Long.toString(cpf);
//        
//        int tamanho= aux.length();
//        digito=Long.parseLong(aux);
//        long auxLong;
//        auxLong=(long)Math.pow(10,(tamanho+1)-posicao);
//        digito=digito % auxLong;
//        digito=(long) (digito/Math.pow(10, tamanho-posicao));
//        return (int)digito;
//    }
    
    private static int obterDigito(long cnpj, int posicao) {
    String aux = Long.toString(cnpj);
    int tamanho = aux.length();
    long digito = Long.parseLong(aux);
    long auxLong = (long) Math.pow(10, (tamanho + 1) - posicao);
    digito = digito % auxLong;
    digito = (long) (digito / Math.pow(10, tamanho - posicao));
    return (int) digito;
}

    
    public static boolean isCpfValido(String cpf){
        //remove todos os caracteres não  numeros
        String stringAux=cpf.replaceAll("[^\\d]+", "");
        if (stringAux.length()!=11){return false;}
        long aux=Long.parseLong(stringAux);
        int soma = 0;
        int [] vet = new int [11];
        
        for(var i=1;i<=9;i++){
            vet[i]=VerificaCadastroPessoal.obterDigito(aux, i); 
            soma=soma+(vet[i]*10-i);
        }
        int resto=soma%10;
        if (resto==10){
            resto=0;
        }
        soma=0;
        vet[10]=resto;
        for(var i=0;i<=9;i++){
            soma=soma+(vet[i+1]*i);
            
        
        }
        resto=soma%10;
        if (resto==10){
            resto=0;
        }
        if (vet[10]==VerificaCadastroPessoal.obterDigito(aux,10)&&
                resto==VerificaCadastroPessoal.obterDigito(aux,11)){
            return true;
        }
        return false;
    }
    
    
    
    public static boolean isCnpjValido(String cnpj) {
        
        String stringAux = cnpj.replaceAll("[^\\d]+", "");
        if (stringAux.length() != 14) {
            return false;
        }
        long aux = Long.parseLong(stringAux);
        int soma = 0;
        int[] vet = new int[14];
        int[] pesosPrimeiroDigito = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] pesosSegundoDigito = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        for (int i = 0; i < 12; i++) {
            vet[i] = obterDigito(aux, i + 1);
            soma += vet[i] * pesosPrimeiroDigito[i];
        }

        int resto = soma % 11;
        if (resto < 2) {
            resto = 0;
        } else {
            resto = 11 - resto;
        }
        vet[12] = resto;

        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += vet[i] * pesosSegundoDigito[i];
        }

        resto = soma % 11;
        if (resto < 2) {
            resto = 0;
        } else {
            resto = 11 - resto;
        }
        vet[13] = resto;

        return (vet[12] == obterDigito(aux, 13) && vet[13] == obterDigito(aux, 14));
    }



    
}
