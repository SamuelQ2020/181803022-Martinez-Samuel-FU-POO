
import java.util.Scanner;

public class JuegoMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ak ak = new Ak();

        int valor, i = 1;
        while (i < 3) {
            if (i == 1) {
                System.out.println("\n ----MENU---- \n");
                System.out.println("Jugador " + i + " elija la categoria del arma");
                System.out.println("1. Bronce");
                System.out.println("2. Plata");
                System.out.println("3. Oro");
                System.out.println("4. Diamante");
                System.out.println("5. Adamantium");
                valor = leer.nextInt();

                Personaje p1 = new Personaje("Samuel"); //CONSTRUCTOR VACIO 
                p1.equiparArma(valor);
                System.out.println(p1);
                System.out.println(p1.disparar());

                i++;
            } else {
                System.out.println("\n ----MENU---- \n");
                System.out.println("Jugador " + i + " elija la categoria del arma");
                System.out.println("1. Bronce");
                System.out.println("2. Plata");
                System.out.println("3. Oro");
                System.out.println("4. Diamante");
                System.out.println("5. Adamantium");
                valor = leer.nextInt();

                Personaje p2 = new Personaje("Marcus");
                p2.equiparArma(valor);
                System.out.println(p2);
                System.out.println(p2.disparar());

                i++;
            }
            if(i == 3){
                System.out.println("\n ----MENU---- \n");
                System.out.println("Jugador " + i + " elija la categoria del arma");
                System.out.println("1. Bronce");
                System.out.println("2. Plata");
                System.out.println("3. Oro");
                System.out.println("4. Diamante");
                System.out.println("5. Adamantium");
                valor = leer.nextInt();

                Personaje p3 = new Personaje("Dominic"); 
                p3.equiparArma(valor);
                System.out.println(p3);
                System.out.println(p3.disparar());    
                    
            }
        }
    }
}
