public class DogCreator {

    public static void main(String[] args) {
        Dog barsik = new Dog();
        Dog bobik = new Dog();

        barsik.name = "barsik";
        bobik.name = "bobik";

        barsik.bark();
        bobik.bark();
    }
}