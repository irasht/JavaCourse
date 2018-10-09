package bird_word;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return true;
    }
}