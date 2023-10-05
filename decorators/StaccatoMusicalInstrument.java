package assignment3.decorators;

import assignment3.MusicalInstrument;
import assignment3.NoteDurationException;
import player.NoteOutOfRangeException;

public class StaccatoMusicalInstrument extends MusicalInstrumentDecorator{

    public StaccatoMusicalInstrument(MusicalInstrument instrumentDecorator){
        super(instrumentDecorator);
    }


    @Override
    public void playNote(int noteIx, int duration) throws NoteOutOfRangeException, NoteDurationException {
        if(duration>20){
            super.playNote(noteIx,20);
            super.playNote(-200,duration-20);

        }else {
            super.playNote(noteIx, duration);
        }
    }

    @Override
    public String toString() {
        return super.toString()+" with staccato";
    }
}
