import java.util.Scanner;

public class Zodiaco {

    public static void main(String[] args) {
        int dia, mes;
        Scanner leer = new Scanner(System.in);

        System.out.println("Que dia naciste");
        dia = leer.nextInt();

        System.out.println("Que mes naciste");
        mes = leer.nextInt();
        
            switch (mes) {
                case 1:
                    //Enero
                    if (dia >= 21) {
                        System.out.println("Acuario");
                    } else {
                        System.out.println("Capricornio");
                    }
                    break;
                case 2:
                    //Febrero
                    if (dia > 19) {
                        System.out.println("Piscis");
                    } else {
                        System.out.println("Acuario");
                    }
                    break;
                case 3:
                    //Marzo
                    if (dia >= 20) {
                        System.out.println("Aries");
                    } else {
                        System.out.println("Piscis");
                    }
                    break;
                case 4:
                    //Abril
                    if (dia > 20) {
                        System.out.println("Tauro");
                    } else {
                        System.out.println("Aries");
                    }
                    break;
                case 5:
                    // Mayo
                    if (dia >= 21) {
                        System.out.println("Geminis");
                    } else {
                        System.out.println("Tauro");
                    }
                case 6:
                    //Junio
                    if (dia > 20) {
                        System.out.println("Cancer");
                    } else {
                        System.out.println("Geminis");
                    }
                    break;
                case 7:
                    //Julio
                    if (dia > 22) {
                        System.out.println("Leo");
                    } else {
                        System.out.println("Cancer");
                    }
                    break;
                case 8:
                    //Agosto
                    if (dia > 21) {
                        System.out.println("Virgo");
                    } else {
                        System.out.println("Leo");
                    }
                    break;
                case 9:
                    //Septiembre
                    if (dia > 22) {
                        System.out.println("Libra");
                    } else {
                        System.out.println("Virgo");
                    }
                    break;
                case 10:
                    //Octubre
                    if (dia > 22) {
                        System.out.println("Escorpion");
                    } else {
                        System.out.println("Libra");
                    }
                    break;
                case 11:
                    //Noviembre
                    if (dia > 21) {
                        System.out.println("Sagitario");
                    } else {
                        System.out.println("Escorpion");
                    }
                    break;
                case 12:
                    //Diciembre
                    if (dia > 21) {
                        System.out.println("Capricornio");
                    } else {
                        System.out.println("Sagitario");
                    }
                    break;
            }
          
    }
}
