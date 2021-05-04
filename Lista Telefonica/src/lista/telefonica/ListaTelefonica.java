package lista.telefonica;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;

public class ListaTelefonica {

    public static void menu() {
        System.out.println("=== LISTA TELEFONICA ===");
        System.out.println("- Cadastro de contato (1)");
        System.out.println("- Impressão de contatos(2)");
        System.out.println("- Busca de contatos (3) ");
        System.out.println("- Sair (4) ");
        System.out.println("Digite a opcao desejada: ");
    }

    public static void cadastrar() {
        PrintWriter arquivo = null;
        Scanner teclado = new Scanner(System.in);
        String nome = null;
        try {
            arquivo = new PrintWriter(new FileWriter("lista_telefonica.txt", true));
            System.out.println("=== CADASTRO ===");
            do {
                  System.out.println("Digite o nome do contato: ");
                  nome = teclado.nextLine(); 
                  if(nome.contains(" ")){
                      System.out.println("SO E POSSIVEL CADASTRAR O PRIMEIRO NOME!");
                  }
            } while (nome.contains(" "));
            System.out.println("Digite o numero do contato: ");
            int numero = teclado.nextInt();
            arquivo.print(nome + "," + numero + "\n");
            System.out.println("CADASTRO REALIZADO COM SUCESSO!: ");
        } catch (Exception e) {
            System.out.println("Numero de telefone invalido: " + e);
            System.out.println("FALHA AO REALIZAR O CADASTRO!");
        } finally {
            arquivo.close();
            System.out.println("\n");
        }
    }

    public static void imprimir() {
        Scanner arquivo = null;
        System.out.println("=== CONTATOS ===");
        try {
            arquivo = new Scanner(new FileReader("lista_telefonica.txt"));
            while (arquivo.hasNext()) {
                System.out.println(arquivo.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Erro durante a impressao: " + e);
        } finally {
            arquivo.close();
            System.out.println("\n");
        }
    }

    public static void buscar() {
        String nome = null;
        Scanner arquivo = null;
        int quant = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== BUSCAR CONTATO ===");
        System.out.println("Digite o nome do contato: ");
        nome = teclado.nextLine();
        try {
            arquivo = new Scanner(new FileReader("lista_telefonica.txt"));
            while (arquivo.hasNext()) {
                String[] retornoSplit = arquivo.nextLine().split(",");
                if (nome.equals(retornoSplit[0])) {
                    System.out.println("\nNumero:" + retornoSplit[1] + "\n");
                    quant++;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca: " + e);
            arquivo.close();
        } finally {
            if (quant == 0) {
                System.out.println("NENHUM CONTATO ENCONTRADO!\n\n");
            }
            arquivo.close();
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int digito;
        int erro = 0;
        for (int i = 0; i >= 0; i++) {
            menu();
            try {
                digito = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Conteudo digitado invalido!");
                digito = 0;
                erro = 1;
                i = -5;
            }
            switch (digito) {
                case 0:
                    if (erro == 0) {
                        System.out.println("Digito nao corresponde a nenhuma opcao!");
                    }
                    System.out.println("Voltando para a tela inicial...\n");
                    erro = 0;
                    break;
                case 1:
                    cadastrar();
                    break;
                case 2:
                    imprimir();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    i = -5;
                    break;
                default:
                    System.out.println("Digito nao corresponde a nenhuma opcao!");
            }

        }
    }
}
