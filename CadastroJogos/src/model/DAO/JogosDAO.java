/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import model.Jogos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aleba
 */
public class JogosDAO {
    Connection con;
    
    public void cadastrarJogo (Jogos j) throws SQLException{
        con = (Connection) new Conexao().getConnection();
        String sql = "Insert into JogosJava (Nome,Estilo,Preço,Empresa) values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, j.getNome());
        stmt.setString(2, j.getEmpresa());
        stmt.setFloat(3, j.getPreco());
        stmt.setString(4, j.getEstilo());
        stmt.execute();
        stmt.close();
        con.close();
        
    }
    
    public void excluirJogo(String nome, String empresa) throws SQLException {
        con = (Connection) new Conexao().getConnection();
        String sql = "DELETE FROM JogosJava WHERE Nome=? AND Empresa=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, empresa);
        stmt.execute();
        stmt.close();
        con.close();
    }
}
