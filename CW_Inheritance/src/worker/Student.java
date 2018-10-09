package worker;

public class Student extends Person {
	final String TYPE_PERSON = "Student";

	@Override
	public void print() {
		System.out.println("I am a "+TYPE_PERSON);
	}
}