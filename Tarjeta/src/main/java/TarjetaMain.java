public class TarjetaMain {
    public static void main(String[] args) {
        
        Tarjet morada=new Tarjet();
        morada.credito=0;
        morada.pagoMensualidad=0;
        morada.tazaInteres=0;
        morada.puntosCompras=9;
        System.out.println(morada.toString());
        
        Tarjet estudiante=new Tarjet();
        estudiante.credito=0;
        estudiante.pagoMensualidad=0;
        estudiante.tazaInteres=0;
        estudiante.puntosCompras=3;
        System.out.println(morada.toString());
        
        Tarjet buhoespecial=new Tarjet();
        buhoespecial.credito=0;
        buhoespecial.pagoMensualidad=0;
        buhoespecial.tazaInteres=0;
        buhoespecial.puntosCompras=12;
        System.out.println(buhoespecial.toString());
        
        Tarjet docente=new Tarjet();
        docente.credito=0;
        docente.pagoMensualidad=0;
        docente.tazaInteres=0;
        docente.puntosCompras=2;
        System.out.println(buhoespecial.toString());
        
        Tarjet buhoblancooro=new Tarjet();
        buhoblancooro.credito=0;        
        buhoblancooro.pagoMensualidad=0;
        buhoblancooro.tazaInteres=0;
        buhoblancooro.puntosCompras=15;
        System.out.println(buhoblancooro.toString());
    }
}
