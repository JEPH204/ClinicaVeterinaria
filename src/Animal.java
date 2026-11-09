public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public abstract double costoConsulta();

    public void imprimirFicha() {
        System.out.println("--- Ficha Veterinaria ---");
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Animal: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Costo de consulta: $" + costoConsulta());
    }
}
