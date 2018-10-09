package cat_dog;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Ìÿó");
    }

    @Override
    public void feed() {
        System.out.println("Feed me!");
    }
}