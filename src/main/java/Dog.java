public class Dog extends Pet {
    // Instance variable(s)
    String breed;


    // Constructors

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
        super();
    }

    // makeNoise() method

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }


    // toString method

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }


    // Getter

    public String getBreed() {
        return this.breed;
    }

    // Setter

    public void setBreed(String breed) {
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }
}