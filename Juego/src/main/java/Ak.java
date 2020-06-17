//CLASE LA PLANTILLA PODER CREAR OBJETOS
//Si tiene un constructo vacio

public class Ak {
    //ATRIBUTOS DATOS O CARACTERISTICAS DEL OBJETO DE MANERA GENERAL
    String tipo;
    int cargador;
    int precision; 
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;
    
   /*
    //Constructor con un parametro
    public Ak(String tipo){
        this.tipo=tipo;  
    }
    */

    //Constructor vacio
    public Ak(){   
    }
    
    //Constructor con todos los parametros
    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio, double velocidadDisparo){
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.danio =  danio;
        this.velocidadDisparo = velocidadDisparo;
        
    }
    
    /*
    public void apuntar(){
    }
    
    public void recargar(){
    }
    */
    
    //Metodo predefinido por oracle
    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", danio=" + danio + ", velocidadDisparo=" + velocidadDisparo + '}';
    }
   
    
    
}
