package assignment3;

public class Note {
    private int noteIx;
    private int duration;

    public Note(int noteIx, int duration) {
        this.noteIx = noteIx;
        this.duration = duration;
    }

    public int getNoteIx() {
        return noteIx;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "note index: " + noteIx + ", duration: " + duration;
    }
}
