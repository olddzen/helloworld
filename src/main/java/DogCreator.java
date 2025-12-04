public class DogCreator {

    public static void main(String[] args) {
        Dog barsik = new Dog();
        Dog bobik = new Dog();
        Dog marko = new Dog();

        barsik.name = "barsik";
        bobik.name = "bobik";
        marko.name = "marko";


        barsik.bark();
        bobik.bark();
        marko.bark();
    }
}