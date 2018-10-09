package bird_word;

public abstract class Bird {
    public String feathers;
    public int layEggs;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract boolean fly();

    @Override
    public String toString() {
        return " feathers is " + feathers + ", it produces " + layEggs + " eggs. It can fly: ";
    }
}