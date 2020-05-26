import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n, val=40;
        System.out.println("Intenta adivinar el numero secretp para salir");
        do{
            System.out.println("Teclea cualquier numero");
            n=leer.nextInt();
            if(n<50){
                System.out.println("El numero que tecleo es menor al numero secreto");
            }
            else
                System.out.println("El numero que tecleo es mayor al numero secreto");
        }while(n != 50);
        System.out.println("Encontro el numero secreto");
    }
}
