
package EstruturaDeDados;
import java.util.Scanner;

public class EstruturaDeDados {
    Scanner t = new Scanner(System.in);
        int i=25,size=50;
        String [] la = new String [50];
        String [] ll = new String [i];
        String [] aux = new String [i];
        int Pavg = (size-i)/2+1;
          int cont =0;
   
     
        

    public  void criarLista() {
        //aloca um espaço para LL de 25 nodos dentro de LA
        for(int k=Pavg; k<Pavg+25; k++){
             for(int o=0; o<25; o++){
                la[k] = ll[o];
             }
        }
        
      }
    
    public  void iNodoI(){ 
        String confI = la[ll.length];
        System.out.println("Digite o valor a ser inserido");
        String v = t.next();
        
        //varre o array checando se ha elementos nulos
        for(i=0; i<ll.length; i++){
             aux[i] = la[Pavg+i];
             
            if(aux[i] == null && confI != null ){
              cont++;
            }
        }
       //-----------------------------------------------
     
       if (cont != 0 && confI == null){
           //desloca os nodos, dando espaço ao novo 
            //pega o ponto inicial de LL dentro de LA e o varre na busca de nulos para fazer a movimentação
            for(i=Pavg; i<ll.length; i++){
           
                if(la[Pavg] != null && cont !=0 ){
                la[Pavg]=la[Pavg++];
                
                //faz uma verificação final para checar se o elemento inicial do array é realmente nulo
                    if(la[Pavg]==null){
                        la[Pavg] = v;
                         System.out.println("Inserido com sucesso");
                     }else{
                        System.out.println("Se está lendo isso, o código deu errado ");
                    }
                }
            }
       
        
           
       } else
       
       
       
        //checa se o valor final não é nulo
        if(confI != null){
         
        //pega o ponto inicial de LL dentro de LA e o varre na busca de nulos para fazer a movimentação
            for(i=Pavg; i<ll.length; i++){
           
                if(la[Pavg] != null && cont !=0 ){
                la[Pavg]=la[Pavg++];
                
                //faz uma verificação final para checar se o elemento inicial do array é realmente nulo
                    if(la[Pavg]==null){
                        la[Pavg] = v;
                         System.out.println("Inserido com sucesso");
                     }else{
                        System.out.println("Se está lendo isso, o código deu errado ");
                    }
                }
            }
        }else{
            System.out.println("A lista está cheia");
        }  
    }
    
    public  void iNodoM(){
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public  void iNodoF(){
        String confF = la[Pavg];
        System.out.println("Digite o valor a ser inserido");
        String v = t.next();
        
        //varre o array checando se ha elementos nulos
        for(i=0; i<ll.length; i++){
             aux[i] = la[Pavg+i];
             
            if(aux[i] == null && confF != null ){
              cont++;
            }
        }
       //-----------------------------------------------
     
       
       //Fazendo teste para o caso do elemento inicial ser nulo, permitindo a deslocação
       if (cont != 0 && confF == null){
    
            //faz a movimentação
            for(i=Pavg; i<ll.length; i++){
           
                if(la[Pavg] != null && cont !=0 ){
                la[Pavg+ll.length]=la[Pavg+ll.length-i];
                
                //faz uma verificação final para checar se o elemento inicial do array é realmente nulo
                    if(la[Pavg]==null){
                        la[Pavg] = v;
                         System.out.println("Inserido com sucesso");
                     }else{
                        System.out.println("Se está lendo isso, o código deu errado ");
                    }
                }
            }
       
        
           
       } else
       
       
       
        //checa se o valor inicial não é nulo
        if(confF != null){
         
        //pega o ponto inicial de LL dentro de LA e o varre na busca de nulos para fazer a movimentação
            for(i=0; i<ll.length; i++){
           
                if(la[Pavg+ll.length] != null && cont !=0 ){
                la[Pavg+ll.length]=la[Pavg+ll.length-i];
                
                //faz uma verificação final para checar se o elemento inicial do array é realmente nulo
                    if(la[Pavg+ll.length]==null){
                        la[Pavg+ll.length] = v;
                         System.out.println("Inserido com sucesso");
                     }else{
                        System.out.println("Se está lendo isso, o código deu errado ");
                    }
                }
            }
        }else{
            System.out.println("A lista está cheia");
        }  
    }
    
    public  void rNodoI(){
        //define o primeiro valor como nulo
         la[Pavg] =null;
    } 
    
    public   void rNodoF(){
        //define o ultimo valor como nulo
        la[Pavg+ll.length] =null;
    }
    
    public  void removerLL(){
        //Define o valor de LL para null
        for(int j=Pavg; j<Pavg+ll.length; j++){
            la[j] = null;
            
        }
      }
    
    public   void imprimirLL(){
        //mostra os valores de LL
        for(int j=0; j<ll.length; j++){
           System.out.print (ll[j]+"==");
            
        }
    }
    
    public   void imprimirLA(){
        //mostra os valores de LA
        for(int j=0; j<la.length; j++){
           System.out.print (la[j]+"==");
            
        }
    }
     
    public  void fim(){
        //sai do programa
        System.exit(1);
    
    }
    
   
    
}


