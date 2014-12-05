package dp.prototype;

public class NotesManager {

	public enum Notes {
		HALF_QUARTER_NOTE(new Note(0.5f, 0)), 
		ONE_QUARTER_NOTE(new Note(1, 0)), 
		TWO_QUARTER_NOTE(new Note(2, 0));

		private Note note;

		private Notes(Note note) {
			this.note = note;
		}

		public Note getNote() {
			return note;
		}
	}

	public Note[] createDefaultMelody() {
		Note[] notes = new Note[3];

		notes[0] = Notes.HALF_QUARTER_NOTE.getNote().clone();
		notes[1] = Notes.ONE_QUARTER_NOTE.getNote().clone();
		notes[2] = Notes.TWO_QUARTER_NOTE.getNote().clone();

		return notes;
	}

}
