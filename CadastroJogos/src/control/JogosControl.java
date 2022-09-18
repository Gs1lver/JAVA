/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.SQLException;
import model.Jogos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DAO.JogosDAO;

/**
 *
 * @author aleba
 */
public class JogosControl {
    private ArrayList<Jogos> lstJogos;
     private static JogosControl inst;
     private JogosDAO jdao = new JogosDAO();
    
    private JogosControl() throws SQLException{
        lstJogos = jdao.buscarJogo();
    } 
    
    public ArrayList<Jogos> getList(){
        return lstJogos;
    }
    
    public static JogosControl getInstance() throws SQLException {
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
    
    public ArrayList<Jogos> arrayNew(String nome){
        ArrayList<Jogos> arrayNovo = new ArrayList<>();
        for(Jogos j: lstJogos){
            if(j.getNome().toLowerCase().startsWith(nome.toLowerCase()))
                arrayNovo.add(j);     
        } 
        if (arrayNovo.size() == 0) // ou isEmpty()
            throw new IllegalArgumentException("Nenhum jogo encontrado"); 
        return arrayNovo;
    }
    
     public Jogos pesquisa(String nome){
        for(Jogos j: lstJogos){
            if(j.getNome().toLowerCase().startsWith(nome.toLowerCase()))
                return j;     
        } 
        throw new IllegalArgumentException("Jogo não encontrado");     
    }
     
    public Jogos removerJogo(String nome) throws SQLException{
        Jogos j = pesquisa(nome);
        lstJogos.remove(j);
        jdao.removerJogo(j);
        return null;
    }
    
}
