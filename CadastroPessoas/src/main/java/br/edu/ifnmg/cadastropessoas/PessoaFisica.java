/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.cadastropessoas;
import io.github.guisso.taskmanagement.entity.Entity;
import java.time.LocalDate;
/**
 *
 * @author braga
 */
public class PessoaFisica 
        extends Entity{
    private String nome;
    private LocalDate nascimento;
    private char sexo;
    private boolean isExcluded;

    public void setId(long id) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isIsExcluded() {
        return isExcluded;
    }
    
    
}
