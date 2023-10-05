package assignment3.decorators;


import assignment3.MusicalInstrument;
import assignment3.NoteDurationException;
import player.NoteOutOfRangeException;

public class TempoScaledMusicalInstrument extends MusicalInstrumentDecorator {
    private double scaleFactor;
    public TempoScaledMusicalInstrument(MusicalInstrument instrument){
        super(instrument);
        scaleFactor = 1;
    }

    @Override
    public void playNote(int noteIx, int duration) throws NoteOutOfRangeException, NoteDurationException {
        super.playNote(noteIx, (int)(duration*scaleFactor));
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    @Override
    public String toString() {
        return scaleFactor+ " tempo scaled " + super.toString();
    }
}
