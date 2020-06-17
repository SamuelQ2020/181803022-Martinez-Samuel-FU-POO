import java.util.Scanner;

public class Comparacionnumeros {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        System.out.println("Introdusca el primer numero:");
        n1=leer.nextInt();
        System.out.println("Introdusca el segundo numero:");
        n2=leer.nextInt();
        System.out.println("Introdusca el tercer numero:");
        n3=leer.nextInt();
        System.out.println("Introdusca el cuarto numero:");
        n4=leer.nextInt();
        System.out.println("Introdusca el quinto numero:");
        n5=leer.nextInt();
        
        if(n2<=n1){
            System.out.println("No puedes poner un numero menor al anterior");
        }
        if(n3<=n2){
            System.out.println("No puedes poner un numero menor al anterior");
        }
        if(n4<=n3){
            System.out.println("No puedes poner un numero menor al anterior");
        }
        if(n5<=n4){
            System.out.println("No puedes poner un numero menor al anterior");
        }
    }
}
