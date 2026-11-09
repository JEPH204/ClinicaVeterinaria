public class Ave extends Animal{

    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double costoConsulta(){
        return 28000 + (100 * pesoGramos);
    }
}
