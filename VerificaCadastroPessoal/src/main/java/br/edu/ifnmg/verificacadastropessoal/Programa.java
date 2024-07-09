/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.verificacadastropessoal;

/**
 *
 * @author braga
 */
public class Programa {

    public static void main(String[] args) {
        //Testes
        
        System.out.println("Teste 1");
        System.out.println(VerificaCadastroPessoal.
                isCpfValido(14230703058L));
        System.out.println("Teste 2");
        System.out.println(VerificaCadastroPessoal.
                isCpfValido("142.307.030-58"));
        System.out.println("Teste 3");
        System.out.println(VerificaCadastroPessoal.
                isCpfValido(230703058L));
        System.out.println("Teste 4");
        System.out.println(VerificaCadastroPessoal.
                isCpfValido("002.307.030-58"));
        System.out.println("Teste 5");
        System.out.println(VerificaCadastroPessoal.
                isCpfValido(456789014L));
        System.out.println("Teste 6");
        System.out.println(VerificaCadastroPessoal.
                isCnpjValido("35.017.120/0001-86"));
        System.out.println("Teste 7");
        System.out.println(VerificaCadastroPessoal.
                isCnpjValido(35017120000186L));
        System.out.println("Teste 8");
        System.out.println(VerificaCadastroPessoal.
                isCnpjValido("35.017.120/0001-88"));
                
        return;
        
    }
}
