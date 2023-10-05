package assignment3.decorators;

import assignment3.MusicalInstrument;
import assignment3.NoteDurationException;
import player.NoteOutOfRangeException;

public class ShiftedMusicalInstrument extends MusicalInstrumentDecorator{
    private int shift;

    public ShiftedMusicalInstrument(MusicalInstrument instrument){
        super(instrument);
        shift = 0;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return shift + "shifted" + super.toString();
    }

    @Override
    public void playNote(int noteIx, int duration) throws NoteOutOfRangeException, NoteDurationException {
        super.playNote(noteIx + shift, duration);
    }
}
