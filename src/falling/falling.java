
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class falling {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int num1=leer.nextInt();
        leer.nextLine();
        int p1 =0;
        int p2 =0;
        
        String []  prueba =  new String[num1];
       
       ArrayList<Integer> numeros=new ArrayList<>();
        String num2=leer.nextLine();
       
        
        int numero_x;
         int i=0;
        prueba = num2.split(" ");
        for(i= 0; i<prueba.length; i++){
            numero_x = Integer.parseInt(prueba[i]);
            numeros.add(numero_x);
        
        }
        Collections.sort(numeros);
     
      int cont=0;
        for( i =numeros.size()-1; i>=0; i--){
            if(cont==0){
                p1=p1+numeros.get(i);
                cont=cont+1;
            }else if(cont==1){
                p2=p2+numeros.get(i);
                cont=cont-1;
            }
        }
        System.out.println(p1+" "+p2);  
       
        
    }
    
    
}