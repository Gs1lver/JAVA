/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.ResultSet;
import model.Jogos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public void removerJogo(String nome) throws SQLException {
        con = (Connection) new Conexao().getConnection();
        String sql = "DELETE FROM JogosJava WHERE Nome=? limit 1";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void removerJogo(Jogos j) throws SQLException{
        removerJogo(j.getNome());
    }
    
    public ArrayList<Jogos> buscarJogo() throws SQLException{
        con = (Connection) new Conexao().getConnection();
        String sql = "SELECT * FROM JogosJava";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<Jogos> juegos = new ArrayList<>();
        while(rs.next()){
            String nome = rs.getString("Nome");
            String estilo = rs.getString("Estilo"); 
            float preco = rs.getFloat("Preço");
            String empresa = rs.getString("Empresa");
            
            Jogos j = new Jogos(nome, estilo, preco, empresa);
            juegos.add(j);
        }
            return juegos;
    }
    
    public void buscarJogo(Jogos j)throws SQLException{
        con = (Connection) new Conexao().getConnection();
        String sql = "SELECT * FROM JogosJava WHERE Nome=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, j.getNome());
        stmt.setString(2, j.getEmpresa());
        stmt.setFloat(3, j.getPreco());
        stmt.setString(4, j.getEstilo());
        stmt.execute();
        stmt.close();
        con.close();
    }
}
