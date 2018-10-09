package worker;

public class Cleaner extends Staff {
	final String TYPE_PERSON = "Cleaner";

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}

	@Override
	public int salary() {
		return 90;
	}
}