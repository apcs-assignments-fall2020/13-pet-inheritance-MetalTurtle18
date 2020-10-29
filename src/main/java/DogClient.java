public class DogClient {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", 2, "Dogdog");

        dog.makeNoise();
        System.out.println(dog);
    }
}