package cat_dog;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Ãàâ");
    }

    @Override
    public void feed() {
        System.out.println("Eat, eat!");
    }
}