public class Main {

    static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Perro("Max", 4, "Juan David", "Golden");
        animales[1] = new Gato("Nacho", 6, "Juan Camilo", true);
        animales[2] = new Ave("Pichon", 1, "Luis", 150.5);

        for (Animal a: animales) {
            a.imprimirFicha();
            System.out.println("____________________");
        }

        // Declararlos con su tipo concreto
        Perro miPerro = new Perro("Firulais", 4, "Carlos", "Labrador");
        Gato miGato = new Gato("Michi", 2, "Ana", true);

        // Registrar las vacunas
        miPerro.registrarVacuna("Rabia");
        miPerro.registrarVacuna("Gripe Perruna");

        miGato.registrarVacuna("Gripe Felina");

        // Imprimir cuántas lleva cada uno usando los getters
        System.out.println("Vacunas del perro (" + miPerro.getNombre() + "): " + miPerro.getVacunasAplicadas());
        System.out.println("Vacunas del gato (" + miGato.getNombre() + "): " + miGato.getVacunasAplicadas());

        // Creamos la instancia de la Clínica
        Clinica clinicaVet = new Clinica("VetCare Central", "Calle 100 # 15-20");

        //Metemos al perro, al gato y a la clínica en un arreglo de tipo Asegurable[]
        Asegurable[] asegurables = new Asegurable[3];
        asegurables[0] = miPerro;
        asegurables[1] = miGato;
        asegurables[2] = clinicaVet;

        // Recorremos el arreglo con un ciclo imprimiendo póliza y prima anual
        // Para cada elemento aseg de tipo Asegurable dentro del arreglo asegurables, haz lo siguiente... (ciclo for)
        for (Asegurable aseg : asegurables) {
            System.out.println("Número de Póliza: " + aseg.obtenerNumeroPoliza());
            System.out.println("Prima Anual: $" + aseg.calcularPrimaSeguro());
            System.out.println("-----------------------------------");
        }
    }



}
