public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[]{"tiger", "lion", "elephant", "crocodile", "monkey"};
        String animal = animals[3];
        System.out.println(animal);
        int numberOfAnimals = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfAnimals + " elementów.");
    }
}
