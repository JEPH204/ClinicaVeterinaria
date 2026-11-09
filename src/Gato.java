public class Gato extends Animal implements  Vacunable, Asegurable{

    private boolean esEsterilizado;
    private int cantidadVacunas;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double costoConsulta(){
        return 38000;
    }

    // Metodos de la interfaz Asegurable
    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado != true){
            return 200000;
        }
        return 120000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POLIZA-GATO-" + nombre;
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
