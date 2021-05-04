package sistema.folha.salarial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SistemaFolhaSalarial {

    public static void main(String[] args) {
        
        FolhaSalarial f = new FolhaSalarial();
        
        f.addFuncionario(new Vendedor("12345678901","Thiago","Informatica",2,500),2000);
        f.addFuncionario(new Vendedor("12345678902","Rafael","Eletrodomesticos",5,1000),1000);
        f.addFuncionario(new Vendedor("12345678903","Lucas","Cosmeticos",1,1000),1500);
        f.addFuncionario(new Administrador(5,"12345678904","Amanda","Cosmeticos"),1800);
        f.addFuncionario(new Administrador(5,"12345678905","Silas","Informatica"),3000);
        f.addFuncionario(new Administrador(5,"12345678906","Arthur","Eletrodomesticos"),2200);
        
        f.imprimeFuncionario();
        System.out.println("==========================================");
        f.imprimeFuncionario("Informatica");
        System.out.println("==========================================");
        f.imprimeFuncionario('A');
    }
    
}
