import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int lado1,lado2,lado3; 
        
        System.out.println("Introduzca el primer lado:");
        lado1=leer.nextInt();
        System.out.println("Introduzca el segundo lado:");
        lado2=leer.nextInt();
        System.out.println("Introduzca el tercer lado:");
        lado3=leer.nextInt();
       
        
        if(lado1==lado2 && lado2==lado3){
            System.out.println("El triangulo es equilatero");
        } 
        if(lado1 == lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("El triangulo es isoceles");
        }
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("El triangulo es escaleno");
        }
    }
}    

