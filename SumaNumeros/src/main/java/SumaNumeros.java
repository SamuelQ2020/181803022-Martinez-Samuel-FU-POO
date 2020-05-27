import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nums,resul,i,num;
        
        System.out.println("¿Cuantos numeros vas a sumar?");
        nums=leer.nextInt();
        resul=0;
        for(i=1; i<=nums; i++){
            System.out.println("Ingrese el numero("+ i +"):");
            num=leer.nextInt();
            resul=resul+num;
        }
        System.out.println("La suma de los numeros es:"+resul);
    }  
}
