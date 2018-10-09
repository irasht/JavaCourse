package dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky", Breed.GOLDEN_RETRIEVER, 5);
        Dog dog2 = new Dog("Nana", Breed.POODLE, 7);
        Dog dog3 = new Dog("Belj", Breed.SIBERIAN_HUSKY, 1);
        if (!dog1.getName().equals(dog2.getName()) &&
                !dog1.getName().equals(dog3.getName()) &&
                !dog2.getName().equals(dog3.getName())) {
            System.out.println("There is no two dogs with the same name.");
        }
        if (dog1.getAge() > dog2.getAge()) {
            System.out.println("Dog name is: " + dog1.getName() + " it's breed: " + dog1.getBreed());
        } else if (dog2.getAge() > dog3.getAge()) {
            System.out.println("Dog name is: " + dog2.getName() + " it's breed: " + dog2.getBreed());
        } else {
            System.out.println("Dog name is: " + dog3.getName() + " it's breed: " + dog3.getBreed());
        }
    }
}