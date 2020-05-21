public class TipoVariable {
  public static void main(String[]args){
      /*
      Java es un lenguaje fuertemente equipado 
      Debmos declarar el tipo de variable que es 
      y esta siempre estara en el programa, 
      */
      
      //tipo numerico
      int a=10, b=2;
      
      //operaciones aritmeticas
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a/b);
      System.out.println(a%b);
      
      //Tipos flotantes
      float pi=3.14f;
      double pi2=3.14;
      
      //Cambios de variable
      boolean bandera=true;
      
      //Ingresar caracteres 
      char letra='a';
      String palabra="Puedes poner un mensaje largo";
      
      System.out.println( palabra );
      
      //concatenar
      System.out.println(palabra+"Y esta es una prueba de ello");
      
      System.out.println("Este es el valor de pi"+pi);
      System.out.println("Este es el valor del circulo"+(pi*a));
  }  
}
