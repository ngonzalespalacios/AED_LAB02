package LAB02;

public class TestGen {
    public static void main(String[] args) {

        // TEST de exist()
        String[] nombres = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] numeros = {12, 34, 56};
        System.out.println(Exist.exist(nombres, "Sanchez")); // true
        System.out.println(Exist.exist(numeros, 34)); // true
        // System.out.println(Exist.exist(numeros, "Salsa")); // Error

        // TEST con Golosinas
        Cajoneria<Golosina> cajoneria = new Cajoneria<>();
        cajoneria.addCaja(new Caja<>("rojo", new Golosina("Chicle", 10)));
        cajoneria.addCaja(new Caja<>("verde", new Golosina("Caramelo", 15)));
        cajoneria.addCaja(new Caja<>("azul", new Golosina("Gomita", 5)));
        cajoneria.addCaja(new Caja<>("amarillo", new Golosina("Pastilla", 20)));
        cajoneria.addCaja(new Caja<>("blanco", new Golosina("Chocolate", 30)));

        System.out.println("== Cajoneria de Golosinas ==");
        System.out.println(cajoneria);

        System.out.println("Buscar Gomita: " + (cajoneria.search(new Golosina("Gomita", 5)) != null));

        System.out.println("Eliminando Gomita...");
        cajoneria.delete(new Golosina("Gomita", 5));

        System.out.println("== Cajoneria actualizada ==");
        System.out.println(cajoneria);

        // TEST con Chocolatinas
        Cajoneria<Chocolatina> cajonChocolates = new Cajoneria<>();
        cajonChocolates.addCaja(new Caja<>("negro", new Chocolatina("Snickers", 45)));
        cajonChocolates.addCaja(new Caja<>("cafe", new Chocolatina("Milka", 50)));
        cajonChocolates.addCaja(new Caja<>("blanco", new Chocolatina("Kinder", 35)));

        System.out.println("== Cajoneria de Chocolatinas ==");
        System.out.println(cajonChocolates);
    }
}

