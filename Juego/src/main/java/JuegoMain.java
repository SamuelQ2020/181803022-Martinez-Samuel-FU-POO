public class JuegoMain {
    public static void main(String[] args) {
        Ak bronce=new Ak();
        bronce.tipo="bronce";
        bronce.cargador=5;
        bronce.precision=75;
        bronce.velocidadCarga=5;
        bronce.precio=1000;
        bronce.danio=10;
        bronce.velocidadDisparo=10;
        
       System.out.println(bronce.toString()) ;
       
       Ak plata=new Ak();
       plata.tipo="plata";
       plata.cargador=8;
       plata.precision=70;
       plata.velocidadCarga=4.5;
       plata.precio=2300;
       plata.danio=10;
       plata.velocidadDisparo=9.8;
       
       System.out.println(plata.toString());
       
       Ak oro=new Ak();
       oro.tipo="oro";
       oro.cargador=10;
       oro.precision=85;
       oro.velocidadCarga=4.3;
       oro.precio=2500;
       oro.danio=11;
       oro.velocidadDisparo=9.7;
       
       System.out.println(oro.toString());
       
       Ak diamante=new Ak();
       diamante.tipo="diamante";
       diamante.cargador=20;
       diamante.precision=95;
       diamante.velocidadCarga=4.3;
       diamante.precio=2500;
       diamante.danio=11;
       diamante.velocidadDisparo=9.4;
       
       System.out.println(diamante.toString());
       
       Ak adamantium=new Ak();
       adamantium.tipo="adamantium";
       adamantium.cargador=30;
       adamantium.precision=100;
       adamantium.velocidadCarga=1;
       adamantium.precio=10000;
       adamantium.danio=27;
       adamantium.velocidadDisparo=8;
       
       System.out.println(adamantium.toString()); 
    } 
}
