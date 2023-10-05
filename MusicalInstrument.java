package assignment3;

import player.NoteOutOfRangeException;

public interface MusicalInstrument {
    void playSong(Song song) throws NoteOutOfRangeException, NoteDurationException;

    void playNote(int noteIx, int duration) throws NoteOutOfRangeException, NoteDurationException;

    String getName();

    String toString();
}
