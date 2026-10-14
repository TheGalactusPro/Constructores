package dispositivo;

public class Main {
    public static void main() {

        Dispositivo d1 = new Dispositivo("Teclado", "Entrada");
        Dispositivo d2 = new Dispositivo("Mouse", "Entrada");
        Dispositivo d3 = new Dispositivo("Pantalla", "Salida");

        System.out.println("Total de dipsoitivos registrados: " +Dispositivo.getContador());
    }
}
