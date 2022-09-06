/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aleba
 */
public class AlunoDAO {

    Connection con;
    
    public void inserirAluno(Aluno al) throws SQLException
    { 
            con = (Connection) new Conexao().getConnection();
            String sql = "Insert into AlunoJava (RA,Nome) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getRa());
            stmt.setString(2, al.getNome());
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
   public void excluir(int ra) throws SQLException {
        con = (Connection) new Conexao().getConnection();
        String sql = "DELETE FROM AlunoJava WHERE RA = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ra);
        stmt.execute();
        stmt.close();
        con.close();
    }
   
    public ArrayList<Aluno> buscarAlunos() throws SQLException  {
        ResultSet rs;
        ArrayList<Aluno> lista = new ArrayList();
        con = (Connection) new Conexao().getConnection();
        String sql = "SELECT * FROM aluno";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next())
        {
            int ra = rs.getInt("RA");
            String nome = rs.getString("NOME");
            Aluno al = new Aluno(ra, nome);
            lista.add(al);
        }
        stmt.close();
        con.close();   
        return lista;
    }
    
    public ArrayList<Aluno> buscarPorNome(String nomeAluno) throws SQLException  {
        ResultSet rs;
        ArrayList<Aluno> lista = new ArrayList();
        
           con = (Connection) new Conexao().getConnection();
           String sql = "SELECT * FROM aluno WHERE NOME like ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, nomeAluno);
           rs = stmt.executeQuery();
           while (rs.next())
           {
               int ra = rs.getInt("RA");
               String nome = rs.getString("NOME");
               Aluno al = new Aluno(ra, nome);
               lista.add(al);
           }
           stmt.close();
           con.close();   
           return lista;
    }
    
}
