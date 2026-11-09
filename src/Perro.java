public class Perro extends Animal implements Vacunable, Asegurable{

    private String raza;
    private int cantidadVacunas;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    // Metodo de costo (heredado de Animal)
    @Override
    public double costoConsulta() {
        return 45000.0 + (3000.0 * edad);
    }

    // Metodos de la interfaz Asegurable
    @Override
    public double calcularPrimaSeguro() {
        return 80000.0 * edad; // $80.000 por cada año de edad
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POLIZA-PERRO-" + nombre;
    }

    // Metodos de la interfaz Vacunable
    @Override
    public void registrarVacuna(String nombreVacuna) {
        cantidadVacunas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return cantidadVacunas;
    }
}
