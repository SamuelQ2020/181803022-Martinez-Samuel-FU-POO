//CLASE LA PLANTILLA PODER CREAR OBJETOS
public class Ak {
    //ATRIBUTOS DATOS O CARACTERISTICAS DEL OBJETO DE MANERA GENERAL
    String tipo;
    int cargador;
    int precision; 
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;
    
    //METODOS SON LAS ACCIONES / INTERACCIONES DEL OBJETO
    public void dispara(){
        System.out.println("Te estoy disparando con un daño de:"+danio);
    }
    public void apuntar(){}
    public void recargar(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", danio=" + danio + ", velocidadDisparo=" + velocidadDisparo + '}';
    }  
}
