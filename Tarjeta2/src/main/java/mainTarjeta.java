import java.util.Scanner;

public class mainTarjeta {

    public static void main(String[] args) {

        //Avisare al programa que usare un objeto tarjeta
        Tarjeta tarjeta;
        Scanner leer = new Scanner(System.in);
        int noCuenta, nip, opc;

        System.out.print("Introduzca su Numero de cuenta:");
        noCuenta = leer.nextInt();
        System.out.print("Introduzca su NIP:");
        nip = leer.nextInt();
        tarjeta = new Tarjeta().verificarCuenta(noCuenta, nip);
        System.out.println("\n");

        do {
            System.out.println("\n---- Menú de Opciones ----\n");
            System.out.println("1. Hacer un deposito:");
            System.out.println("2. Hacer un retiroo:");
            System.out.println("3. Eliminar apartado:");
            System.out.println("4. Imprimir datos de la cuenta:");
            System.out.println("5. Salir:");
            System.out.println("¿Que opcion desea realizar?:");
            opc = leer.nextInt();
            System.out.println("\n-----------------------------");

            switch (opc) {
                case 1:
                    System.out.println("Monto a Depositar: $");
                    tarjeta.depositar(leer.nextDouble());
                    break;
                case 2:
                    System.out.println("Monto a retirar: $");
                    tarjeta.retirar(leer.nextDouble());
                    break;
                case 3:
                    tarjeta.eliminarapartado();
                    System.out.println("A Eliminado el Apartado");
                    break;
                case 4:
                    System.out.println(tarjeta.toString());
                    break;
            }
        }while(opc!=5);
        
    }
}
