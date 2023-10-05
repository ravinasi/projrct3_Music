package assignment3;

public class Song {
    private String title;
    private Note[] notes;
    int next;

    public Song(String title, int[] noteIxs, int[] durations) {
        this.title = title;
        this.notes = arraysToNotes(noteIxs, durations);
        reset();
    }

    private static Note[] arraysToNotes(int[] noteIxs, int[] durations){
        // This method gets an array of note indexes and array of durations of
        // the same length, and builds a Song object out of them.

        int n = noteIxs.length;
        Note[] notes = new Note[n];
        for (int i = 0; i < n; i++) {
            notes[i] = new Note(noteIxs[i], durations[i]);
        }

        return notes;
    }

    public String getTitle() {
        return title;
    }

    public Note next() {
        Note nextNote = notes[next];
        next++;
        return nextNote;
    }

    public void reset(){
        next = 0;
    }

    public boolean hasNext() {
        return next < notes.length;
    }
}
