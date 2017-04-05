
package EstruturaDeDados;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    
    EstruturaDeDados ex;
    ex = new EstruturaDeDados();
    
    
    
    System.out.println("Digite aqui uma das opçoes do menu");
    System.out.println("1-Criar Lista \n" +
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
    
    do{
    switch (c){
            
            case 1:
               ex.criarLista();
            break;
            case 2:
                ex.iNodoI();
                break;
            case 3:
                ex.iNodoM();
                break;
            case 4:
                ex.iNodoF();
                break;
            case 5:
                ex.rNodoI();
                break;
            case 6:
                ex.rNodoF();
                break;
            case 7:
               ex.removerLL();
               break;
                       
            case 8:
                ex.imprimirLL();
                break;
            case 9:
                ex.imprimirLA();
                break;
            case 10:
                ex.fim();
                break;
    
    }
    }while(c!=10);
            
    
    
}
}
