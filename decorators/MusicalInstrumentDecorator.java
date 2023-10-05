package assignment3.decorators;

import assignment3.MusicalInstrument;
import assignment3.NoteDurationException;
import assignment3.Song;
import player.NoteOutOfRangeException;
import player.Player;

public class MusicalInstrumentDecorator implements MusicalInstrument {

    private MusicalInstrument musicalInstrument;

    protected MusicalInstrumentDecorator(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    @Override
    public void playSong(Song song) throws NoteOutOfRangeException, NoteDurationException {
        musicalInstrument.playSong(song);
    }

    @Override
    public void playNote(int noteIx, int duration) throws NoteOutOfRangeException, NoteDurationException {
        musicalInstrument.playNote(noteIx,duration);
    }

    @Override
    public String getName() {
        return musicalInstrument.getName();
    }

    @Override
    public String toString() {
        return musicalInstrument.getName();
    }
}
