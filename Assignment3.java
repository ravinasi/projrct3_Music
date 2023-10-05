package assignment3;

import assignment3.decorators.ShiftedMusicalInstrument;
import assignment3.decorators.StaccatoMusicalInstrument;
import assignment3.decorators.TempoScaledMusicalInstrument;
import player.NoteOutOfRangeException;
import player.Player;
import player.UnknownInstrumentException;

public class Assignment3 {
    public static void main(String[] args) {
        test();
        System.out.println("Done!");
    }

    private static void test() {

        MusicalInstrument[] instruments = setupInstruments();
        String[] playlist = setupPlaylist();

        SongLibrary library = SongLibrary.library;

        // ------------- START EDITING THE CODE FROM HERE -----------------------
        // TODO: You should modify the code below in order to properly handle exceptions,
        //  as described in the assignment instructions.

        // Playing all songs:
        for (int i = 0; i < playlist.length; i++) {
            try {
                instruments[i].playSong(library.getSong(playlist[i]));
            }catch (NoteOutOfRangeException e){
                System.out.println("Caught a NoteOutOfRangeException, skipping song. Exception message:\n" +
                        e.getMessage());
            }catch (NoteDurationException e){
                System.out.println("Caught a NoteDurationException, skipping song. Exception message:\n" +
                        e.getMessage());
            }

            pause();
            System.out.println();
        }

        MusicalInstrumentImpl harmonica = null;

        while (harmonica == null) {
            try {
                harmonica = instantiateHarmonica();
            }catch (UnknownInstrumentException e){
                System.out.println("Caught an UnknownInstrumentException. Exception message:\n" + e.getMessage());
                System.out.println("Registering Harmonica...");
                Player.registerInstrument("Harmonica", 22);
            }
        }


        // ------------- DON'T EDIT ANY CODE BELOW!!! -----------------------

        System.out.println("Succeeded in instantiating an instrument: " + harmonica);
    }

    private static MusicalInstrumentImpl instantiateHarmonica() throws UnknownInstrumentException {
        // TODO: You should modify the code below in order to properly handle exceptions,
        //  as described in the assignment instructions.
        MusicalInstrumentImpl harmonica;
        try {
            harmonica = new Harmonica();
        } catch (UnknownInstrumentException e) {
            System.out.println("Cannot instantiate Harmonica. Please register the instrument first. Passing handling responsibility to calling method.\n");
            throw e;
        }finally {
            System.out.println("Exiting instantiateHarmonica()");
        }
        return harmonica;
    }

    private static String[] setupPlaylist() {
        // DON'T CHANGE THIS METHOD!!!

        String[] playlist = new String[] {
                "Hissing of Summer Lawns",
                "Hissing of Summer Lawns",
                "No Other Country",
                "Happy Birthday",
                "Unicorn",
                "Twinkle Twinkle",
                "Ha Tikva",
                "Exceptional song #1",
                "Exceptional song #2",
                "Exceptional song #3"
        };
        return playlist;
    }

    private static MusicalInstrument[] setupInstruments(){
        // DON'T CHANGE THIS METHOD!!!

        // Constructing all instruments:
        try {
            MusicalInstrument piano = new Piano();

            TempoScaledMusicalInstrument tempoScaledPiano =
                    new TempoScaledMusicalInstrument(piano);
            tempoScaledPiano.setScaleFactor(0.5);

            MusicalInstrument staccatoPiano = new StaccatoMusicalInstrument(piano);

            TempoScaledMusicalInstrument doubleDecoratedPiano =
                    new TempoScaledMusicalInstrument(staccatoPiano);
            doubleDecoratedPiano.setScaleFactor(0.5);

            ShiftedMusicalInstrument shiftedTrumpet = new ShiftedMusicalInstrument(new Trumpet());
            shiftedTrumpet.setShift(10);

            TempoScaledMusicalInstrument doubleDecoratedTrumpet =
                    new TempoScaledMusicalInstrument(shiftedTrumpet);
            doubleDecoratedTrumpet.setScaleFactor(0.7);

            ShiftedMusicalInstrument tripleDecoratedPiano =
                    new ShiftedMusicalInstrument(doubleDecoratedPiano);
            tripleDecoratedPiano.setShift(-10);

            MusicalInstrument[] instruments = new MusicalInstrument[]{
                    piano, tempoScaledPiano, staccatoPiano, doubleDecoratedPiano,
                    shiftedTrumpet, doubleDecoratedTrumpet, tripleDecoratedPiano,
                    piano, piano, piano
            };
            return instruments;
        } catch (UnknownInstrumentException e) {
            // The program should not arrive to this point as we only use pre-registered instruments.
            throw new RuntimeException(e);
        }
    }


    private static void pause() {
        // DON'T CHANGE THIS METHOD!!!

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
