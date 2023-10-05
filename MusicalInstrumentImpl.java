package assignment3;

import player.NoteOutOfRangeException;
import player.Player;
import player.UnknownInstrumentException;

public class MusicalInstrumentImpl implements MusicalInstrument {
    protected String name;
    protected Player player;

    public MusicalInstrumentImpl(String name) throws UnknownInstrumentException {
        this.name = name;
        player = new Player(name);
        try {
            // Playing one short note in order to eliminate first note delay.
            player.playNote(0, 10);
        } catch (NoteOutOfRangeException e) {
            // Do nothing
        }
    }

    @Override
    public void playSong(Song song) throws NoteOutOfRangeException, NoteDurationException {
        System.out.println("Playing " + song.getTitle() + " on " + this);
        song.reset();
        while (song.hasNext()) {
            Note next = song.next();
                playNote(next.getNoteIx(), next.getDuration());
        }
        System.out.println("Done playing " + song.getTitle());
    }

    @Override
    public void playNote(int noteIx, int duration) throws NoteOutOfRangeException, NoteDurationException {
        System.out.println("Playing note index: " + noteIx + ", duration: " + duration);
        if (duration < 0)
            throw new NoteDurationException(noteIx);
        player.playNote(noteIx, duration);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
