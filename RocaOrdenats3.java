//*Este programa diu si una cadena de caracters estàn ordenada. La llagaria de la cadena es donada al principi de esta seguida de el els nombres */
import java.util.Scanner; 
public class RocaOrdenats3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    //Declarem la variable que controle en numero de vegades que comprobarem el número
    int n = scanner.nextInt();    //Esta variable diu el nombre de caracters que te lacadena.
    int numero1;    //Variable que usem per guardar en memoria.
    int numero2;    //Variable que usem per llegir una nova entrada.
    boolean ordenat = true;   //Variable que usem per dir si la cadena de nombres està ordenada.
    // TEST PERE
    //Demanem el primer nombre i el guerdem 
    numero1 = scanner.nextInt();
    //Bucle que controle el numero de vegades que comaparem els valors (n-1)
    for(int i=0; i < n-1; i++){
       //Demanem segont nombre i el guardem
       numero2 = scanner.nextInt();
        //Comparem el dos nombres
        if(numero2 >= numero1){
             //Si el segon es igual o mes gran que el primer cxambiem el valor del primer per el segons
             numero1 = numero2;
        }else{
           //Si el segon es mes petit que el primer llegim la resta de linia, declarem variable boolean com false(break) 
           ordenat = false;
        }
             
    }
        
        //Imprimim variable boolean 

    System.out.println(ordenat);

    }
}
