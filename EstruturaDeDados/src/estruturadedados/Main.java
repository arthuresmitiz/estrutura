
package EstruturaDeDados;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    
    EstruturaDeDados ex;
    ex = new EstruturaDeDados();
    
    
    
    System.out.println("Digite aqui uma das opçoes do menu");
    System.out.println("1-Criar Lista <\n" +
                       "2-Inserir  Nodo no Inicio\n" +
                        "3-Inserir  Nodo no Meio\n" +
                        "4-Inserir  Nodo no Fim\n" +
                        "5-Remover Nodo Inicio\n" +
                        "6-Remover Nodo Fim\n" +
                        "7-Remover Lista [LL]\n" +
                        "8-Imprimir Lista [LL]\n" +
                        "9-Imprimir Lista [LA]\n" +
                        "10-Fim");
    int c =t.nextInt();
    
    
    switch (c){
            
            case 1:
               EstruturaDeDados.criarLista();
            break;
            case 2:
                EstruturaDeDados.iNodoI();
                break;
            case 3:
                EstruturaDeDados.iNodoM();
                break;
            case 4:
                EstruturaDeDados.iNodoF();
                break;
            case 5:
                EstruturaDeDados.rNodoI();
                break;
            case 6:
                EstruturaDeDados.rNodoF();
                break;
            case 7:
               EstruturaDeDados.removerLL();
               break;
                       
            case 8:
                EstruturaDeDados.imprimirLL();
                break;
            case 9:
                EstruturaDeDados.imprimirLA();
                break;
            case 10:
                EstruturaDeDados.fim();
                break;
            
            
            
    }
    
}
}
