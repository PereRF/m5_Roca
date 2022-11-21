import java.util.Scanner; 
public class RocaOrdenats3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    //Declarem la variable que controle en numero de vegades que comprobarem el número
    int n = scanner.nextInt();
    int numero1;
    int numero2;
    boolean ordenat = true;
    //Demanem el primer nombre i el guerdem 
    numero1 = scanner.nextInt();
    //Bucle que controle el numero de vegades que comaparem els valors (n-1)
    for(int i=0; i < n-1; i++){
       //Demanem segont nombre i el guardem
       numero2 = scanner.nextInt();
        //Comparem el dos nombres
        if(numero2 >= numero1){
             //Si el segon es igual o mes gran que el primer cxambiem el valor del primer per el segon
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
