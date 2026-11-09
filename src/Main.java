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
    }
}
