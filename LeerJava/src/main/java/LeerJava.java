
import java.util.Scanner;

public class LeerJava {
   public static void main(String[]args){
       Scanner leer=new Scanner( System.in);
       
       System.out.println("Dame tu nombre completo");
       String nombre=leer.nextLine();
       System.out.println("el nombre es:"+nombre);
       
        System.out.println("Dame un numero");
       int numero=leer.nextInt();
       System.out.println("El numero leido es:" +numero);
       
       System.out.println("Dame otro numero");
       double numeroD=leer.nextDouble();
       System.out.println("El numero double leido es:" +numeroD);
       
    }
}
