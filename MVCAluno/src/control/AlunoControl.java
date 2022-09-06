/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import java.util.ArrayList;
import java.util.Optional;
import model.Aluno;
import model.DAO.AlunoDAO;
import java.sql.SQLException;
import javax.swing.table.TableModel;

/**
 *
 * @author aleba
 */
public class AlunoControl {
    private ArrayList<Aluno> lstAluno;
    private static AlunoControl inst;
    private AlunoDAO aldao = new AlunoDAO();
    
    private AlunoControl() {
        lstAluno = new ArrayList<Aluno>();
    }
    
    public static AlunoControl getInstance() {
        if (inst == null) {
            inst = new AlunoControl();
        }
        
        return inst;
    }
    
    public ArrayList<Aluno> getList(){
        return lstAluno;
    }
            
    
    public void inserirAluno (int ra, String nome) throws SQLException {
        Aluno a = new Aluno(ra, nome);
        lstAluno.add(a);
        aldao.inserirAluno(a);
        }
    
    /*public boolean cadastrar (int ra, String nome) {
        try {
            Aluno a = new Aluno(ra, nome);
            AlunoDAO alDao = new AlunoDAO();
            alDao.inserirAluno(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }*/
    
    public ArrayList<Aluno> toList() {
        return this.lstAluno;
    }
    
    public Aluno buscaRA(int ra) {
        for (Aluno al : lstAluno) {
            if (al.getRa() == ra)
                return al;
        }
        
        return null;
    }

    public boolean removerRA(int ra) throws SQLException {
        aldao.excluir(ra);
        return lstAluno.remove(buscaRA(ra));
        
    }
    
}