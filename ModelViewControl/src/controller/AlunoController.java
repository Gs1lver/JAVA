
package controller;

import java.util.ArrayList;
import model.Aluno; // importação do pacote para o reconhecimento da classe Aluno

public class AlunoController {
    private ArrayList<Aluno> lista;
    
    //contrutores
    public AlunoController(){
        lista = new ArrayList<>();
    }
    
    //métodos
    public void cadastrar(String nome, int idade){
        Aluno al = new Aluno(nome, idade);
        lista.add(al);
        mostrar();
    }
    
    public void mostrar(){
        for (Aluno a: lista){
            System.out.println(a.getNome() + "" + a.getIdade() + "\n");
        }     
    }
}
