/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.SQLException;
import model.Jogos;
import java.util.ArrayList;
import model.DAO.JogosDAO;

/**
 *
 * @author aleba
 */
public class JogosControl {
    private ArrayList<Jogos> lstJogos;
     private static JogosControl inst;
     private JogosDAO jdao = new JogosDAO();
    
    private JogosControl(){
        lstJogos = new ArrayList<Jogos>();
    } 
    
    public ArrayList<Jogos> getList(){
        return lstJogos;
    }
    
    public static JogosControl getInstance() {
        if (inst == null) {
            inst = new JogosControl();
        }
        
        return inst;
    }
    public void cadastrarJogo(String nome, String estilo, float preco, String empresa) throws SQLException{
        Jogos j = new Jogos(nome, estilo, preco, empresa);
        lstJogos.add(j);
        jdao.cadastrarJogo(j);
    }
    
    public Jogos removerJogo(String nome, String empresa) throws SQLException{
        for (Jogos j : lstJogos) {
            if (j.getNome().equals(nome) && j.getEmpresa().equals(empresa) )
                lstJogos.remove(j);
        }
        jdao.excluirJogo(nome, empresa);
        return null;
    }
    
    
    
}
