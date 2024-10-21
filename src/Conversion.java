import java.util.Scanner;

/*
* Logica de conversiones de moneda,
* */
public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);
    Consulta conversion;

    public Conversion(Consulta conversion) {
        this.conversion = conversion;
    }
    public String getMonedaOrigen() {
        return monedaOrigen;
    }
    public String getMonedaDestino() {
        return monedaDestino;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void almacenarValores(String monedaOrigen, String monedaDestino){
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        System.out.println("Ingrese el valor a convertir");
        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public String obtenerMensajeRespuesta()
    {
        String mensaje = getMonedaOrigen().toUpperCase() + " " + getCantidad() + " equivale a: " + getMonedaDestino().toUpperCase() + " " + conversion.buscaConversion(getMonedaOrigen(), getMonedaDestino(), getCantidad());
        System.out.println(mensaje);
        return mensaje;
    }
}
