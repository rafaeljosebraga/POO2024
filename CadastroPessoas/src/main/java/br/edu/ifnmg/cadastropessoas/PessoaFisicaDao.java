/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.cadastropessoas;

import io.github.guisso.taskmanagement.repository.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braga
 */
public class PessoaFisicaDao extends 
        Dao<PessoaFisica>{
    
    public static final String TABLE = "pessoafisica";
    
    @Override
    public String getSaveStatment() {
     return "insert into " + TABLE + "(nome, cpf, nascimento, sexo)  values (?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set nome = ?, cpf = ?, nascimento = ? ,sexo, = ? where id = ?";
    }
    //melhor ser feito com calma
    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, PessoaFisica e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //isExluded é na verdade excluído
    @Override
    public String getFindByIdStatment() {
        return "select id, nome, cpf, nascimento, sexo, isExcluded"
                + " from pessoafisica where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select id, nome, cpf, nascimento, sexo, isExcluded"
                + " from pessoafisica where isExluded = false";
    }

    @Override
    public String getMoveToTrashStatement() {
        return "update " + TABLE + " set isExcluded = true"
                + " where id = ?";  
    }

    @Override
    public void moveToTrash(PessoaFisica e) {
        // tem haver com getMoveToTrashStatement
    }

    @Override
    public String getRestoreFromTrashStatement() {
        return "update " + TABLE + " set isExcluded = false"
                + " where id = ?"; }
    //precisa de resposta
    @Override
    public void restoreFromTrash(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFindAllOnTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PessoaFisica> findAllOnTrash() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PessoaFisica extractObject(ResultSet resultSet) {
        
        PessoaFisica pessoa=null;
        try {
            pessoa = new PessoaFisica();
            pessoa.setId(resultSet.getLong("id"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setNascimento(resultSet.getObject("nascimento", LocalDate.class));
            pessoa.setCpf(resultSet.getLong("cpf"));
            pessoa.setExcluded(resultSet.getBoolean("isExcluded"));
        } catch (SQLException ex) {
            Logger.getLogger(PessoaFisicaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoa;
    }

}
