public class TesteAnimal {
    public static void main(String[] args) {
        Gato g = new Gato("Gato");
        Cachorro c = new Cachorro("Cachorro");
        g.patas();
        g.nomea();
        System.out.println("------------------------------------------------------------------------------------------");
        c.patas();
        c.nomea();
    }
}
