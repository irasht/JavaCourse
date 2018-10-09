package cat_dog;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Myrka");
        animals[1] = new Dog("Sharuk");
        animals[2] = new Dog("Biluj");
        animals[3] = new Cat("Pyshok");

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
        }
    }
}