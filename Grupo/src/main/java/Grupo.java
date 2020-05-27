import java.util.Scanner;
public class Grupo {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?:");
        String nombre = leer.nextLine();
        System.out.println("¿Género?¿F o M?");
        String genero = leer.nextLine();
        genero=genero.toUpperCase();
        char[] ch = nombre.toCharArray(); 
        if(("M".equals(genero) && ch[0]< 'm'  )|| ("F".equals(genero) && ch[0] >'n'  )){
          System.out.println("Tu grupo es el A");
        }else{
          System.out.println("Tu grupo es el B");
        }
  }
}

