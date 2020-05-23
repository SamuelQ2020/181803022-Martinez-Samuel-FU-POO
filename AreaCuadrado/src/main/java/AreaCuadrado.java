
import java.util.Scanner;


public class AreaCuadrado {
  public static void main(String args []){
      Scanner leer=new Scanner(System.in);
      double a,area;
      System.out.println("Introduzca el valor del lado del cuadrado");
      a=leer.nextInt();
      area=a*a;
      System.out.println("El avlor del area es:"+area);
  }  
}
 
