package sistema.folha.salarial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FolhaSalarial {
    Funcionario funcs;
    private int numfuncs = 0;
    
    ArrayList<Funcionario> lista = new ArrayList(10);

    public FolhaSalarial() {
        
    }

    public int getNumfuncs() {
        return numfuncs;
    }

    public void setNumfuncs(int numfuncs) {
        this.numfuncs = numfuncs;
    }
    
    public void addFuncionario(Funcionario func, double salario){
        this.numfuncs++;
        func.setSalario(salario);
        lista.add(func);
        
    }
    
    Funcionario retornaFuncionario(int indice){
        int i = 0;
        for(Funcionario x : lista){ 
            if(i == indice){
                return x;
            }
            i++;
        }
        return funcs;
    }
    
    Funcionario retornaFuncionario(String nome){
        for(Funcionario x : lista){ 
            if(x.getNome().equals(nome)){
                return x;
            }
        }
        return funcs;
    }
    
    public void imprimeFuncionario(){
        for(Funcionario x : lista){ 
            System.out.println(x.toString()); //imprime os dados para cada funcionario
        }
    }
    
    public void imprimeFuncionario(String departamento){
        for(Funcionario x : lista){ 
            if(x.getDepartamento().equals(departamento)){
                System.out.println(x.toString());
            }
        }
    }
    
    public void imprimeFuncionario(char inicial){
        for(Funcionario x : lista){
            char letra = x.getNome().charAt(0);
            if(letra == inicial){
                System.out.println(x.toString());
            }
        }
    }
}
