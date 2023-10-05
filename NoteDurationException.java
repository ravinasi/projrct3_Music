package assignment3;

public class NoteDurationException extends Exception {
    public NoteDurationException(int duration){
        System.out.println("Note duration must be nonnegative, got " + duration +".");
    }
}
