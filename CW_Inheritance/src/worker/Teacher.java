package worker;

public class Teacher extends Staff{
	final String TYPE_PERSON = "Teacher";
	@Override
	public void print() {
		System.out.println("I am a "+TYPE_PERSON);
	}

	@Override
	public int salary() {
	return 100;
	}

}