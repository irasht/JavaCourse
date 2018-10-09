package bird_word;

public class NonflyingBird extends Bird{
    public NonflyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
   public boolean fly() {
        return false;
    }
}