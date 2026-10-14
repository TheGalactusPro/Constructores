package dispositivo;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;
    private static int contador = 0;

    public void mostrarInformacion() {
        System.out.println("Nombre: " +getNombre()+ "\nTipo: " +getTipo());
    }

    public void mostrarEstado() {
        String estado = activo ? "Estado: Activo" : "Estado: Inactivo";
        System.out.println(nombre + " " + estado);
    }

    public void activar() {
        if (!activo) {
            activo = true;
            System.out.println(nombre + " Ha sido activado");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    // Constructores

    public Dispositivo (String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        contador ++;
    }

    public static int getContador(){
        return contador;
    }
}
