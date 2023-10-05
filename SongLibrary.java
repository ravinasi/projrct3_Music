package assignment3;

import java.util.HashMap;
import java.util.Map;

public class SongLibrary {
    public Map<String, Song> songs;

    public static final SongLibrary library = new SongLibrary();

    private SongLibrary() {
        songs = new HashMap<>();
        songs.put("Hissing of Summer Lawns", hissingOfSummerLawns());
        songs.put("Little Jonathan", littleJonathan());
        songs.put("Happy Birthday", happyBirthday());
        songs.put("Twinkle Twinkle", twinkleTwinkle());
        songs.put("Ha Tikva", haTikva());
        songs.put("Unicorn", unicorn());
        songs.put("No Other Country", noOtherCountry());
        songs.put("Exceptional song #1", exceptionalSong1());
        songs.put("Exceptional song #2", exceptionalSong2());
    }

    public Song getSong(String songName) {
        return songs.get(songName);
    }

    private Song littleJonathan() {
        int[] littleJonathanNoteIxs = new int[] {
                67, 64, 64, 65, 62, 62,
                60, 62, 64, 65, 67, 67, 67,
                67, 64, 64, 65, 62, 62,
                60, 64, 67, 67, 60
        };

        // Note durations the song "Little Jonathan":
        int[] littleJonathanDurations = new int[] {
                250, 250, 500, 250, 250, 500,
                250, 250, 250, 250, 250, 250, 500,
                250, 250, 500, 250, 250, 500,
                250, 250, 250, 250, 1000
        };


        return new Song(
                "Little Jonathan", littleJonathanNoteIxs,
                littleJonathanDurations);

    }
    private Song happyBirthday() {
        int[] happyBirthdayNoteIxs = new int[] {
                60, 60, 62, 60, 65, 64,
                60, 60, 62, 60, 67, 65,
                60, 60, 72, 69, 65, 64, 62,
                70, 70, 69, 65, 67, 65,
        };

        int[] happyBirthdayDurations = new int[] {
                250, 250, 500, 500, 500, 1000,
                250, 250, 500, 500, 500, 1000,
                250, 250, 500, 500, 500, 500, 500, 500,
                250, 250, 500, 500, 500, 1000
        };

        return new Song(
                "Happy Birthday", happyBirthdayNoteIxs,
                happyBirthdayDurations);

    }

    private Song twinkleTwinkle(){
        int[] notes = {60, 60, 67, 67, 69, 69, 67, 65, 65, 64, 64, 62, 62, 60, 67, 67, 65, 65, 64, 64, 62, 67, 67, 65, 65, 64, 64, 62, 60, 60, 67, 67, 69, 69, 67, 65, 65, 64, 64, 62, 62, 60};
        int[] durations = {500, 500, 500, 500, 500, 500, 1000, 500, 500, 500, 500, 500, 500, 1000, 500, 500, 500, 500, 500, 500, 1000, 500, 500, 500, 500, 500, 500, 1000, 500, 500, 500, 500, 500, 500, 1000, 500, 500, 500, 500, 500, 500, 1000};


        return new Song(
                "Twinkle, Twinkle, Little Star", notes,
                durations);
    }

    private Song haTikva() {
        int[] theTikvaIxs=new int[]{
                55,57,58,60,62,62,63,62,63,
                67,62,60,58,60,60,60,58,58,
                57,55,57,58,55,55,67,67,67,
                65,67,65,63,62,
        };
        int[] theTikvaDurations=new int[]{
                300,300,300,300,500,500,300,
                300,300,400,300,300,300,300,400
                ,300,500,500,300,300,300,300,1000
                ,400,500,500,500,300,300,300,300
                ,700
        };
        return new Song("Ha Tikva", theTikvaIxs, theTikvaDurations);
    }

    private Song unicorn(){
        // Notes for the song "Unicorn" By Noa Kirel:
        int[] UnicornNoteIxs = new int[] {66, 68, 66, 68, 66, 68, 66, 68, 69, 69, 71, 68, 68, 69, 69,66, 68, 66, 68, 66, 68, 66, 68, 69, 69, 71, 68, 68, 69, 69};

        // Note durations the song "Unicorn" By Noa Kirel:
        int[] UnicornDurations = new int[] { 250, 250, 250, 250, 250, 250, 250, 250, 250, 1000, 500, 500, 250, 250, 1000, 250, 250, 250, 250, 250, 250, 250, 250, 250, 1000, 500, 500, 250, 250, 1000 };

        return new Song("Unicorn", UnicornNoteIxs, UnicornDurations);
    }

    private Song noOtherCountry() {
        // Notes for the song "I Have No Other Country":
        int[] iHaveNoOtherCountryNoteIxs = new int[] {
                59,58,56,55,56,59,56,49,49,51,52,51,63,63,61,59,58,56,55,56,59,56,49,49,51,52,51,63,63,61,63};

        // Note durations the song "I Have No Other Country":
        int[] iHaveNoOtherCountryDurations = new int[] {
                700,700,500,250,250,500,500,500,500,500,500,500,500,500,500,700,700,500,250,250,500,500,500,500,500,500,500,500,500,500,500};

        return new Song( "No Other Country", iHaveNoOtherCountryNoteIxs,iHaveNoOtherCountryDurations);
    }

    private Song hissingOfSummerLawns() {
        int[] hissingNotes = new int[] {
                -200, 62, 66, 69, 71, 69, -200, 69, -200, 69, -200,
                69, -200, 59, 59, 59, 62, 62, 66, 64, 62, 59, 64, 59,
                -200, 66, 64, 66, 64, 64, 62, 62, 58, 64, -200, 62, 59,
                62, 64, 64, -200, 66, 69, 71, 69, 66, 66,
                66, 62, 64, 57, 57,
                66, 66, 64, 62, 59, 64, 59
        };
        int[] hissingDurations = new int[] {
                100, 240, 480, 480, 960, 280, 40, 280, 40, 280, 40,
                480, 240, 240, 240, 240, 240, 240, 480, 480, 480, 240, 720, 480,
                1440, 240, 240, 240, 240, 240, 240, 240, 240, 480, 480, 240, 240,
                720, 720, 480, 1200, 480, 240, 1440,
                1680, 480, 240, 240, 480, 720, 240, 240,
                240, 240, 720, 240, 240, 240, 1920
        };

        return new Song( "Hissing of Summer Lawns", hissingNotes, hissingDurations);
    }

    private Song exceptionalSong1() {
        int[] notes = new int[] {
                128
        };
        int[] durations = new int[] {
                10
        };

        return new Song( "Exceptional song #1", notes, durations);

    }

    private Song exceptionalSong2() {
        int[] notes = new int[] {
                60
        };
        int[] durations = new int[] {
                -5
        };

        return new Song( "Exceptional song #2", notes, durations);

    }

}
