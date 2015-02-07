package dp.prototype;

public class Note {

	private float length;
	private int value;

	public Note(float length, int value) {
		super();
		this.length = length;
		this.value = value;
	}

	@Override
	public Note clone() /* throws CloneNotSupportedException */{
		// TODO Auto-generated method stub
		// return super.clone();

		return new Note(length, value);
	}

	// TODO

}
