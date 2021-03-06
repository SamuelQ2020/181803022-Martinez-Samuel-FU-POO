
public class Tarjeta {

    //Atributos de la clase 
    int noCuenta;
    String nombre;
    int nip;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;

    //Metodo Vacio
    public Tarjeta() {

    }

    //Metodo con parametros
    public Tarjeta(int noCuenta, String nombre, int nip, int dia, int mes, int anio, int cv, double monto, double apartado) {
        this.noCuenta = noCuenta;
        this.nombre = nombre;
        this.nip = nip;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cv = cv;
        this.monto = monto;
        this.apartado = apartado;
    }

    public Tarjeta verificarCuenta(int noCuenta, int nip) {
        if (noCuenta == 123123 && nip == 1133) {

            return new Tarjeta(123123, "Eduardo Díaz Flores", 1133, 31, 12, 2032, 543, 45987.22, 550);

        } else if (noCuenta == 456789 && nip == 3367) {

            return new Tarjeta(456789, "Kevin Meza Gonzalez", 3367, 31, 12, 2032, 544, 360, 5322.23);

        } else {
            return new Tarjeta();
        }
    }

    //Metodo para depositar
    public double depositar(double monto) {
        return this.monto += monto;
    }

    //Metodo verificar retiro
    public void verificarretiro(double retiro) {
        if (retiro <= this.monto) {
            retirar(retiro);
            System.out.println("Retiro completo");
        } else {
            System.out.println("No cuenta con el saldo suficiente");
        }
    }

    //Metodo para retirar
    public double retirar(double monto) {
        return this.monto -= monto;
    }

    //Metodo para eliminar el apartado
    public void eliminarapartado() {
        this.monto = this.monto + this.apartado;
        this.apartado = 0; 
    }

    //Verificar apartado
    public void verificarapartado(double apartado) {
        if (apartado <= this.monto) {
            crearapartado(apartado);
            System.out.println("Apartado Creado");
        } else {
            System.out.println("No cuenta con saldo suficiente");
        }
    }

    //Metodo para crear un apartado
    public void crearapartado(double apartado){
        this.apartado = this.apartado + apartado;
        this.monto = this.monto - this.apartado;
    }

    public double Total() {
        return this.monto + this.apartado;
    }

    @Override
        public String toString() {
        return "noCuenta: " + noCuenta + "\nnombre: " + nombre + "\nnip: " + nip
                + "\nFecha de Vencimiento: " + dia + "/" + mes + "/" + anio + "\ncv: " + cv
                + "\nmonto: " + monto + "\napartado: " + apartado + "\nTotal:" + this.Total();
    }
}