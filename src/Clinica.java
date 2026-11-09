public class Clinica implements Asegurable {

    private String nombre;
    private String direccion;

    // Constructor para inicializar los datos
    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Métodos obligatorios de la interfaz Asegurable
    @Override
    public double calcularPrimaSeguro() {
        return 5000000.0; // $5.000.000 fijos por año
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre;
    }
}
